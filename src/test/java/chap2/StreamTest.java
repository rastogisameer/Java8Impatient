package chap2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    @Test
    public void test1(){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("aab");
        list.add("abc");
        list.add("abcd");
        long count = list.stream().filter(w->w.length()>3).count();
        System.out.println(count);
        long count2 = list.parallelStream().filter(w->w.length()>3).count();
    }
    @Test
    public void test2(){
        Stream<String> words = Stream.of("there","goes","them");
        Stream<String> lower = words.map(String::toLowerCase);
    }
    @Test
    public void test3(){
        Stream<String> words = Stream.of("there","goes","them");
        Stream<Stream<Character>> chars = words.map(w -> {
            List<Character> result = new ArrayList<>();
            for (char c : w.toCharArray()) result.add(c);
            return result.stream();
        });
        Stream<Character> chars2 = words.flatMap(w->{
            List<Character> result = new ArrayList<>();
            for (char c : w.toCharArray()) result.add(c);
            return result.stream();
        });


    }
}
