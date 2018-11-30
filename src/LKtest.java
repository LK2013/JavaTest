import java.util.ArrayList;
import java.util.List;

/**
 * @outhor lk
 */
public class LKtest {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    int a;

    public static void main(String[] args) {
        ListTestimpl listTestimpl=new ListTestimpl();
        List<String> a = listTestimpl.myTest("a");
        List<Integer> c=listTestimpl.myTest2("b");
        /*for (String t:a) {
            System.out.println(t);
        }*/
        for (Integer t:c) {
            System.out.println(t);
            System.err.println("t");
        }
       /* LKtest lKtest=new LKtest();
        lKtest.myTest();
        System.out.println("");
        LKtest lKtest1=(LKtest) null;
        System.out.println(lKtest1.getA());*/
    }

}

