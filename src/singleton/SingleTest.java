package singleton;

public class SingleTest {
    public static void main(String[] args) throws InterruptedException {
        for (int i=0; i<10; i++){
            Thread thread = new Thread(() -> {
//                    System.out.println(SingletonHungary.getInstance().hashCode());
//                    System.out.println(SingletonLazy1.getInstance().hashCode());
//                    System.out.println(SingletonLazy2.getInstance().hashCode());
//                    System.out.println(SingletonLazy3.getInstance().hashCode());
                System.out.println(SingletonLazy4.getInstance().hashCode());


            });
            thread.start();
        }
        Thread.sleep(11000);
    }
}
