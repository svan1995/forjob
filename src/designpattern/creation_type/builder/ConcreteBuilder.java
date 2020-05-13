package designpattern.creation_type.builder;

public class ConcreteBuilder extends Builder {

    @Override
    public void buildPartA() {
        product.setPartA("A");
    }

    @Override
    public void buildPartB() {
        product.setPartA("B");
    }

    @Override
    public void buildPartC() {
        product.setPartA("C");
    }
}
