import sun.applet.Main;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FunctionTest {

    public static void main(String[] args) throws IOException {
        Comparator<Apple> c = Comparator.comparing(Apple::getWeight).thenComparing(Apple::getPrice);
        Apple a=new Apple("hongfushi",12,7);
        Apple b=new Apple("youzi",1,3);
        int compare = c.compare(a, b);
        System.out.println(compare);

        Predicate<Apple> redApple= (Apple d)-> d.weight>4;
        Predicate<Apple> isNotRedApple=redApple.negate();

        Function<Integer,Integer> f=x->x+1;
        Function<Integer,Integer> g=x->x*2;
        Function<Integer,Integer> h=f.compose(g);
        Integer apply = h.apply(3);
        System.out.println(apply);


        //流
        List<Apple> apples=new ArrayList<>();
        Apple d=new Apple("naicha",2,3);
        Apple e=new Apple("fengmi",1,9);
        apples.add(a);
        apples.add(b);
        apples.add(d);
        apples.add(e);
        List<Apple> apples1=apples.stream().filter(m->m.weight<4).sorted(Comparator.comparing(Apple::getPrice)).collect(Collectors.toList());
        for (Apple apple:apples1) {
            System.out.println(apple.getName());
        }

        //流的规约，reduce
        List<Integer> numbers=new ArrayList();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        int sum = numbers.stream().reduce(0, (j, k) -> j + k);//0为sum初始值
        System.out.println(sum);

        Optional<Integer> max = numbers.stream().reduce(Integer::max);

        Optional<Integer> min = numbers.stream().reduce(Integer::min);

        long count = numbers.stream().count();
        System.out.println(count);
        System.out.println(max.get());
        System.out.println(min.get());

       /* File file=new File("C://");
        if(file.isDirectory()){
            File[] files=file.listFiles((dir,name)->name.startsWith("ba"));
            for (File Afile:files) {
                if(Afile.isFile()){
                    BufferedReader reader=new BufferedReader(new FileReader(Afile));
                    String next=null;
                    while ((next=reader.readLine())!=null){
                        System.out.println(next);
                    }
                    reader.close();
                }
            }

        }*/


        try {
            Process process = Runtime.getRuntime().exec(
                    "cmd.exe  /c notepad c:/base14_1130 (1).csv");
        } catch (Exception e1) {
            e1.printStackTrace();
        }

    }
}
