package chap12;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        char[] a1 = {'j', 'a', 'v', 'a'};

        char[] a2 = Arrays.copyOf(a1, a1.length);

        System.out.println(a2);

        String[] sa = {"케이크", "애플", "도넛", "바나나"};
        print(sa);

        Arrays.sort(sa);
        print(sa);

        System.out.println(Arrays.binarySearch(sa, "애플"));

        Arrays.fill(sa, 2, 4, "기타");
        print(sa);
    }

    private static void print(Object[] oa) {
        for (Object o : oa) {
            System.out.print(o + " ");
        }
        System.out.println();
    }


}
