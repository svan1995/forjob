package singleton;

public class SingletonLazy2 {
    public static SingletonLazy2 singletonLazy;

    private SingletonLazy2(){}

    public static synchronized SingletonLazy2 getInstance(){
        if (singletonLazy == null){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singletonLazy = new SingletonLazy2();
        }
        return singletonLazy;
    }
}
