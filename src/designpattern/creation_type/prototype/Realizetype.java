package designpattern.creation_type.prototype;

public class Realizetype implements Cloneable {
    public Realizetype(){
        System.out.println("具体原型创建成功");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功");
        return (Realizetype)super.clone();
    }




    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype1 = new Realizetype();
        Realizetype realizetype2 = (Realizetype) realizetype1.clone();
        System.out.println(realizetype1 == realizetype2);
    }
}
