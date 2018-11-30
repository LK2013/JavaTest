package JDKproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
//实现事务处理器
public class TimeHandler implements InvocationHandler {
    private Object porxyObjec;
    public TimeHandler(Object porxyObjec){
        this.porxyObjec=porxyObjec;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime=System.currentTimeMillis();
        System.out.println("开始运行"+startTime);
        Object invoke = method.invoke(porxyObjec);
        long endTime=System.currentTimeMillis();
        System.out.println("结束运行"+endTime);
        System.out.println("一共耗时"+(endTime-startTime)+"ms");
        return invoke;
    }
}
