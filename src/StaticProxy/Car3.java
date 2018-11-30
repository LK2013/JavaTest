package StaticProxy;

public class Car3 implements Moveable {
    private Moveable car;
    public Car3(Moveable car){
        this.car=car;
    }
    @Override
    public void move() {
        long starttime=System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        car.move();//父类方法
        long endtime=System.currentTimeMillis();
        System.out.println("汽车结束行驶");
        System.out.println("汽车行驶时间"+(endtime-starttime)+"ms");
    }
}
