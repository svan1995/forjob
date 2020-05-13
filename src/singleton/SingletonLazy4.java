package singleton;

public class SingletonLazy4 {
    public static SingletonLazy4 singletonLazy;

    private SingletonLazy4(){}

    public static SingletonLazy4 getInstance(){
        if (singletonLazy == null){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (SingletonLazy4.class){
                if (singletonLazy == null){
                    singletonLazy = new SingletonLazy4();
                }
            }

        }
        return singletonLazy;
    }
}
