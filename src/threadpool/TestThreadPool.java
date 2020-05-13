package threadpool;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class TestThreadPool {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPool =
                new ThreadPoolExecutor(10,10, 60l, TimeUnit.SECONDS,  new LinkedBlockingQueue<>());

    }
}
