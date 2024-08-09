package chap12.rambda;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
    public static void main(String[] args) {
        sort1();
        lambdaSort();
    }

    public static void sort1() {
        String[] strings = {"로마에 가면 로마법을 따르라.", "시간은 금이다", "펜은 칼보다 강하다"};

        Arrays.sort(strings, new Comparator<String>() {
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        for (String string : strings) {
            System.out.println(string);
        }
    }


    //람다식사용
    public static void lambdaSort() {
        String[] strings = {"로마에 가면 로마법을 따르라.", "시간은 금이다", "펜은 칼보다 강하다"};
        Arrays.sort(strings, (f, s) -> f.length() - s.length());
        System.out.println("----------- 람다식 사용 -----------");
        for (String string : strings) {
            System.out.println(string);
        }
    }

}
