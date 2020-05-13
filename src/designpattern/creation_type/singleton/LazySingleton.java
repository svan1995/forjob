package designpattern.creation_type.singleton;

public class LazySingleton {
    private static volatile LazySingleton lazySingleton = null;
    private LazySingleton(){};

    public static synchronized LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    public static void main(String[] args) {
        LazySingleton instance1 = LazySingleton.getInstance();
        System.out.println(instance1);
        System.out.println("------------->");
        LazySingleton instance2 = LazySingleton.getInstance();
        System.out.println(instance2);
    }

}


