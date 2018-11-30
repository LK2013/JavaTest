package proxytest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxyTest {
    public static void main(String[] args) {
        HelloWorld helloWorld1=new HelloWorldImpl();
        HelloWorld helloWorld = (HelloWorld) Proxy.newProxyInstance(HelloWorld.class.getClassLoader(),
                new Class<?>[]{HelloWorld.class} , new HelloAddHandler(helloWorld1));
        helloWorld1.sayHello();
        helloWorld.sayHello();
    }
}
