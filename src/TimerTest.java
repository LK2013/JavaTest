import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class TimerTest {
    public static final Map<String, Map<String, String>> conllections_map=new ConcurrentHashMap<>();
    public static final int TEST=1;
    public static void main(String[] args) {
        Timer timer=new Timer();
        TimerTask mytask1= new TimerTask() {
            @Override
            public void run() {
                System.out.println("this is mytask1");
            }
        };
        Calendar calendar=Calendar.getInstance();
        //calendar.add(Calendar.SECOND,10);
        Date runtime=calendar.getTime();
        Date date=new Date();
        //timer.schedule(mytask1,date);
        //mytask1.cancel();//任务取消
        //timer.cancel();
        timer.schedule(mytask1,runtime,4000);
        int count=0;
        for (int i=0;i<10;i++){
            count=count++;
        }
        System.out.println(count);
        System.out.println(10.00-9.60);

        long p=new Long(10*60*1000);
        System.out.println(p);
        List<String> list=null;
       // if(list.isEmpty()){System.out.println("true");}
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("A","c");
        conllections_map.put("a", hashMap);
        System.out.println(conllections_map.get("a"));
    }
}
