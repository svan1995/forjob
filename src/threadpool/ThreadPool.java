package threadpool;

public interface ThreadPool {
    void execute(Runnable runnable);

    void shutdown();

    void addWorkers(int num);

    void removeWorkers(int num);

    int getJobSize();

}
