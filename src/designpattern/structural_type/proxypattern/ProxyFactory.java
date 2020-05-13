package designpattern.structural_type.proxypattern;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class ProxyFactory implements MethodInterceptor {

    private Object targert;

    public ProxyFactory(Object targert) {
        this.targert = targert;
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object result = null;
        if(method.getName().equals("write")){
            System.out.println("start...");
            method.invoke(targert, objects);
            System.out.println("end...");

        }
        return result;
    }

    public Object getProxyInstance(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targert.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public static void main(String[] args) {
        Writer target = new Writer();
        Writer proxyInstance = (Writer) new ProxyFactory(target).getProxyInstance();
        proxyInstance.write();
    }

}
