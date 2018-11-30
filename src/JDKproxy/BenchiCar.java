package JDKproxy;

public class BenchiCar implements Car{
    @Override
    public void move() throws InterruptedException {
        System.out.println("BenchiCar正在行驶");
        Thread.sleep(234);
    }
}
