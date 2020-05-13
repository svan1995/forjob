package designpattern.structural_type.proxypattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SingerProxy2 {
    public static void main(String[] args) {
        ISinger target = new Singer();
        ISinger proxy = (ISinger) Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy1, Method method, Object[] args1) throws Throwable {
                        Object result = null;
                        if (method.getName().equals("sing")) {
                            System.out.println("hello");
                            result = method.invoke(target, args1);
                            System.out.println("end");
                        }
                        if (method.getName().equals("eat")) {
                            System.out.println(proxy1.getClass().getName());
                            result = method.invoke(target, args1);
                        }
                        return result;
                    }
                });
        proxy.sing();
        proxy.eat();

    }
}
