package StaticProxy;

import java.util.Random;

public class Car2 extends Car {
    @Override
    public void move() {
        long starttime=System.currentTimeMillis();
        System.out.println("汽车开始行驶");
        super.move();//父类方法
        long endtime=System.currentTimeMillis();
        System.out.println("汽车结束行驶");
        System.out.println("汽车行驶时间"+(endtime-starttime)+"ms");
    }
}
