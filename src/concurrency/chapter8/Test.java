package concurrency.chapter8;

public class Test implements Runnable {

    private void test(){
        System.out.println(11);
    }
    @Override
    public void run() {
        System.out.println(1);
    }

    public static void main(String[] args) {
        new Test().test();
    }
}
