package singleton;

public class SingletonLazy1 {
    public static SingletonLazy1 singletonLazy;

    private SingletonLazy1(){}

    public static SingletonLazy1 getInstance(){
        if (singletonLazy == null){
            try {
                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            singletonLazy = new SingletonLazy1();
        }
        return singletonLazy;
    }
}
