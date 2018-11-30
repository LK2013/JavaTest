import java.util.concurrent.TimeUnit;

public class FinallyTest {
    public static void main(String[] args) {
        Thread t = new Thread(new Task());
        t.setDaemon(true); //置为守护线程
        t.start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            throw new RuntimeException("the "+Thread.currentThread().getName()+" has been interrupted",e);
        }
    }
}
class Task implements Runnable {
    @Override
    public void run() {
        System.out.println("enter run()");
        try {
            System.out.println("enter try block");
            TimeUnit.SECONDS.sleep(5); //阻塞5s
        } catch(InterruptedException e) {
            System.out.println("enter catch block");
            throw new RuntimeException("the "+Thread.currentThread().getName()+" has been interrupted",e);
        } finally {
            System.out.println("enter finally block");
        }
    }
}
