package JDKproxy;

import java.lang.reflect.Proxy;

public class ProxyTest {
    public static void main(String[] args) throws InterruptedException {
        Car aodi=new AodiCar();
        Car benchi=new BenchiCar();
        BenchiCar benchiCar=new BenchiCar();
        Car aodiProxy=(Car)Proxy.newProxyInstance(Car.class.getClassLoader(),new Class[]{Car.class},new TimeHandler(aodi));
        Car benchiProxy=(Car)Proxy.newProxyInstance(Car.class.getClassLoader(),new Class[]{Car.class},new TimeHandler(benchi));
        aodiProxy.move();
        benchiProxy.move();;
    }
}
