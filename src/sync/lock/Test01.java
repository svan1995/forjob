package sync.lock;

import java.util.concurrent.locks.ReentrantLock;

public class Test01 {
    static ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) {
        lock.lock();
        lock.unlock();
    }
}
