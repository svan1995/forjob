package concurrency.chapter4;

import java.sql.Connection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class ConnectionPoolTest {



    static ConnectionPool pool = new ConnectionPool(10);
    static CountDownLatch start = new CountDownLatch(1);
    static CountDownLatch end;




   static class ConnectionRunner implements Runnable{

        int count;
        AtomicInteger got;
        AtomicInteger notgot;

        public ConnectionRunner(int count, AtomicInteger got, AtomicInteger notgot) {
            this.count = count;
            this.got = got;
            this.notgot = notgot;
        }

        @Override
        public void run() {
            try {
                start.await();
            } catch (InterruptedException e) {

            }
            while (count > 0){
                try {
                    Connection connection = pool.fetchConnection(1000);
                    if(connection != null){
                        try {
                            connection.createStatement();
                            connection.commit();
                        }
                        finally {
                            pool.releaseConnection(connection);
                            got.incrementAndGet();
                        }
                    }else {
                        notgot.incrementAndGet();
                    }
                }catch (Exception ex){}
                finally {
                    count--;
                }
            }
            end.countDown();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        int threadCount = 20;
        end = new CountDownLatch(threadCount);
        int count = 20;
        AtomicInteger got = new AtomicInteger();
        AtomicInteger notgot = new AtomicInteger();
        for (int i=0; i<threadCount; i++){
            Thread thread = new Thread(new ConnectionRunner(count, got, notgot));
            thread.start();
        }

        start.countDown();
        end.await();
        System.out.println("total invoke: " + (threadCount * count));
        System.out.println("got connection: " + got);
        System.out.println("not got connection " + notgot);
    }


}
