package threadpool;


import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;

public class DefaultThreadPool implements ThreadPool {


    private static final int MAX_SIZE = 10;
    private static final int MIN_SIZE = 1;
    private static final int DEFAULT_SIZE = 5;

    private final LinkedList<Runnable> jobs = new LinkedList<>();

    private final List<Worker> workers = Collections.synchronizedList(new ArrayList<Worker>());

    private int workerNum = DEFAULT_SIZE;

    public DefaultThreadPool(int num){

    }

    public DefaultThreadPool(){
        initializeWorkers(DEFAULT_SIZE);
    }

    private void initializeWorkers(int num) {
        for (int i=0; i<num; i++){
            Worker worker = new Worker();
            workers.add(worker);
            Thread thread = new Thread(worker);
            thread.start();
        }
    }


    @Override
    public void execute(Runnable job) {
        if (job != null){
            synchronized (jobs){
                jobs.add(job);
                jobs.notify();
            }
        }
    }

    @Override
    public void shutdown() {
        for (Worker worker : workers){
            worker.shutdown();
            System.out.println("shutdown");
        }
    }

    @Override
    public void addWorkers(int num) {


    }

    @Override
    public void removeWorkers(int num) {

    }

    @Override
    public int getJobSize() {
        synchronized (jobs){
            return jobs.size();
        }
    }

    class Worker implements Runnable{
        private volatile boolean running = true;

        @Override
        public void run() {
            while (running){
                Runnable job = null;
                synchronized (jobs){
                    while (jobs.isEmpty()){
                        try {
                            jobs.wait(1000);
                            if (running == false){
                                break;
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    if (running == false){
                        break;
                    }
                    job = jobs.removeFirst();
                }
                if (job != null){
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + ": ");
                    job.run();
                }
            }
        }
        public void shutdown(){
            running = false;
        }
    }
}


