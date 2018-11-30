package proxytest;

public class HelloWorldImpl implements HelloWorld {
    @Override
    public String sayHello() {
        System.out.println("Hello World!");
        return "Hello World!";
    }
}
