package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.atomic.AtomicInteger;

public class JavaProxy {
    public static void main(String[] args) {
        AtomicInteger atomicInteger;
        JavaDeveloper csf = new JavaDeveloper("csf");
        Developer proxy = (Developer)Proxy.newProxyInstance(csf.getClass().getClassLoader(),
                csf.getClass().getInterfaces(),
                (proxy1, method, args1) -> {
                    if (method.getName().equals("code")) {
                        System.out.println("praying for the code!");
                        return method.invoke(csf, args1);
                    }
                    return null;
                }
                );
        proxy.code();
        proxy.debug();
    }
}
