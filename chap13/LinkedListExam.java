package chap13;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


//링크드, 어레이 리스트 성능비교
public class LinkedListExam {
    public static void main(String[] args) {
        List<String> list1 = new LinkedList<String>();
        List<String> list2 = new ArrayList<String>();

        long start;
        long end;


        // 0번째에 추가하기 때문에 어레이 리스트가 더 걸리는 시간이 긺

        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list2.add(0,String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("array list 걸린시간 : " + (end - start) + "ms" );


        start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            list1.add(0,String.valueOf(i));
        }
        end = System.currentTimeMillis();
        System.out.println("linked list 걸린시간 : " + (end - start) + "ms");


    }
}
