package stream_pkg;

import jdk.jshell.execution.Util;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FilterDemo {

    public static void main(String[] args) {
        Stream<String> s1 = Stream.of("a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3");
        Stream<String> s2 = s1.filter(s -> s.startsWith("c"));
        Stream<String> s3 = s2.skip(1);
        System.out.println("문자열 스트림 : ");
        s3.forEach(System.out::println);


        IntStream i1 = IntStream.of(1, 2, 1, 3, 3, 2, 4);
        IntStream i2 = i1.filter(i -> i % 2 == 0);
        IntStream i3 = i2.distinct();

        System.out.println("\n정수 스트림 : ");
        i3.forEach(System.out::println);

        
    }
}

