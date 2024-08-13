package chap14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        for(int i = 0; i < 10; i++) {
            list.add(r.nextInt(100));

        }

        List<Integer> gt10 = new ArrayList<>();
        for(int i : list) {
            if (i > 10) {
                gt10.add(i);
            }
        }
        System.out.println(gt10);
        Collections.sort(gt10);
        System.out.println(gt10);

        list.stream().filter(i -> i > 10).sorted().forEach(System.out::println);
    }
}
