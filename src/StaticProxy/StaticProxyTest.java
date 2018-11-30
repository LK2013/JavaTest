package StaticProxy;

public class StaticProxyTest {
    public static void main(String[] args) {
        //继承方式
        Car2 car=new Car2();
        car.move();

        //聚合方式
        Car car1=new Car();
        Car3 car3=new Car3(car1);
        car3.move();
    }
}
