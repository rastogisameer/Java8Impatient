package chap1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaTest {
    @Test
    public void test1(){

        List<String> list = new ArrayList<String>();
        list.add("aaaaa");
        list.add("bbbb");

        list.forEach(System.out::println);

        list.sort((o1, o2) -> Integer.compare(o1.length(), o2.length()));

        list.forEach(System.out::println);
    }

    @Test
    public void test2(){

      Thread t = new Thread(()->{
          System.out.println(this);
      });
      t.start();

        Thread t2 = new Thread(()->System.out.println(this));
        t2.start();

        Runnable runner = () -> {
            System.out.println("running");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
    }
    @Test
    public void test3(){

        ProcessString func = (s)-> {
            System.out.println(s);
        };
        func.printName();
        Processor obj = new Processor();
        obj.process(func);

        Processor obj2 = new Processor();
        obj2.process(System.out::println);


    }
    @Test
    public void test4(){

        String[] arr = {"aaa","bbb","a12","b23"};
        Arrays.sort(arr, String::compareToIgnoreCase);

        System.out.println(arr);
    }
    @Test
    public void test5(){
        Processor obj2 = new Processor();
        obj2.calculate(Math::pow);
    }
    @Test
    public void test6(){
        Processor obj2 = new FastProcessor();
        obj2.sayHello();
    }
    @Test
    public void test7(){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("bbb");
        Stream<MutableString> stream = list.stream().map(MutableString::new);
        List<MutableString> mlist = stream.collect(Collectors.toList());
        mlist.forEach(System.out::print);
        MutableString[] mutableStrings = stream.toArray(MutableString[]::new);
    }
    @Test
    public void test8(){
        Processor obj2 = new FastProcessor();
        obj2.sayAsync("damn");
    }
}

