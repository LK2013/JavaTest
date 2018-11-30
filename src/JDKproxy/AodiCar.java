package JDKproxy;

public class AodiCar implements Car {
    @Override
    public void move() throws InterruptedException {
        System.out.println("AodiCar正在行驶！");
        Thread.sleep(284);
    }
}
