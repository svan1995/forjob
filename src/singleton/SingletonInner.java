package singleton;

public class SingletonInner {
    private static class Holder{
        private static SingletonInner singleton = new SingletonInner();
    }
    private SingletonInner(){}

    public static SingletonInner getInstance(){
        return Holder.singleton;
    }
}
