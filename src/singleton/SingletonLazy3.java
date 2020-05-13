package singleton;

public class SingletonLazy3 {
    public static SingletonLazy3 singletonLazy;

    private SingletonLazy3(){}

    public static SingletonLazy3 getInstance(){
        if (singletonLazy == null){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (SingletonLazy3.class){
                singletonLazy = new SingletonLazy3();
            }

        }
        return singletonLazy;
    }
}
