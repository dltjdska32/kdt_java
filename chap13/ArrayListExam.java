package chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ArrayListExam {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("java");
        list.add("jdbc");
        list.add("servlet/jsp");
        list.add(2, "database");
        list.add("ibatis");

        int size = list.size();
        System.out.println("총 객체 : " + size);
        System.out.println();

        System.out.println("2 : " + list.get(2));

        System.out.println();

        int cnt = 0;
        for (String s : list) {
            System.out.println(cnt + " : " + s);
            cnt++;
        }


        // 리스트 forEach() 함수사용        // consumer 사용 출력
        Consumer<String> cons = x -> System.out.println("list data " + x);
        list.forEach(cons);

        list.remove(2);
        list.remove(3);
        list.forEach(cons);

        // 직접 출력
        list.forEach( x -> System.out.println("list data " + x));

    }


}
