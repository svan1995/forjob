package concurrency.chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

public class DefaultThreadPool<Job extends Runnable> implements ThreadPool {

    private static final int MAX_WORKER_NUMBERS = 10;

    private static final int DEFAULT_WORKER_NUMBERS = 5;

    private static final int MIN_WORKER_NUMBERS = 1;

    private final List<Worker> workers = Collections.synchronizedList(new ArrayList<>());

    private final LinkedList<Job> jobs = new LinkedList<>();

    private int workerNum = DEFAULT_WORKER_NUMBERS;

    private AtomicLong threadNum = new AtomicLong();

    public DefaultThreadPool(){
        initializeWorkers(DEFAULT_WORKER_NUMBERS);
    }

    public DefaultThreadPool(int num){
        workerNum = num > MAX_WORKER_NUMBERS ? MAX_WORKER_NUMBERS : num < MIN_WORKER_NUMBERS ? MIN_WORKER_NUMBERS : num;
        initializeWorkers(workerNum);
    }

    private void initializeWorkers(int num) {
        for(int i=0; i<num; i++){
            Worker worker = new Worker();
            workers.add(worker);
            Thread thread = new Thread(worker, "ThreadPool-Worker-" + threadNum.incrementAndGet());
            thread.start();
        }
    }



    @Override
    public void execute(Runnable job) {
        if(job != null){
            synchronized (jobs){
                jobs.addLast((Job) job);
                jobs.notify();
            }
        }
    }

    @Override
    public void shutdown() {
        for(Worker worker : workers){
            worker.shutdown();
        }
    }

    @Override
    public void addWorkers(int num) {
        synchronized (jobs){
            if(num + workerNum > MAX_WORKER_NUMBERS){
                num = MAX_WORKER_NUMBERS - workerNum;
            }
            initializeWorkers(num);
            workerNum += num;
        }
    }

    @Override
    public void removeWorker(int num) {
         synchronized (jobs){
             if (num > workerNum){
                 throw new IllegalArgumentException("beyond workNum");
             }
             int count = 0;
             while (count < num){
                 Worker worker = workers.get(count);
                 if(workers.remove(worker)){
                     worker.shutdown();
                     count++;
                 }
             }
             workerNum -= num;
         }
    }

    @Override
    public int getJobSize() {
        return jobs.size();
    }

    class Worker implements Runnable{

        private volatile boolean running = true;

        @Override
        public void run() {
            while (running){
                Job job = null;
                synchronized (jobs){
                    while (jobs.isEmpty()){
                        try {
                            jobs.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            return;
                        }
                    }
                    job = jobs.removeFirst();
                    if(job != null){
                        try {
                            job.run();
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                    }
                }
            }
        }

        public void shutdown(){
            running = false;
        }
    }
}
