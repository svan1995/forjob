package concurrency.chapter4;

public interface ThreadPool<Job extends Runnable> {
    void execute(Runnable job);
    void shutdown();
    void addWorkers(int num);
    void removeWorker(int num);
    int getJobSize();
}
