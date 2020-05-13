package designpattern.structural_type.proxypattern;

import org.junit.Test;

public class SingerProxy1 implements ISinger {

    private ISinger iSinger;

    public SingerProxy1(ISinger iSinger) {
        this.iSinger = iSinger;
    }

    @Override
    public void sing() {
        System.out.println("hello!");
        iSinger.sing();
        System.out.println("end");
    }

    @Override
    public void eat() {

    }


    public static void main(String[] args) {
        ISinger iSinger = new Singer();
        ISinger singerProxy = new SingerProxy1(iSinger);
        singerProxy.sing();
    }

}
