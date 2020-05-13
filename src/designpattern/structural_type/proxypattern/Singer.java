package designpattern.structural_type.proxypattern;

public class Singer implements ISinger {
    @Override
    public void sing() {
        System.out.println("sing a sang!!!");
    }

    public void eat(){
        System.out.println("wwwww");
    }
}
