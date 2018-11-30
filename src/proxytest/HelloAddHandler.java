package proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class HelloAddHandler implements InvocationHandler {
    Object proxyObject;
    public HelloAddHandler(Object proxyObject){
        this.proxyObject=proxyObject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("My Name is LiKai!");
        Object invoke = method.invoke(proxyObject, args);
        System.out.println("Thank you!");
        return invoke;
    }
}
