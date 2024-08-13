package chap13;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<String>();
        System.out.println(q.poll()); // 큐에서 요소제거후, 반환 큐가 비어있을경우 null반환 -> 큐가 비어있어서 null출력

        q.offer("사과");              //사과 큐에 추가후, 성공적으로 추가되면 true반환
        System.out.println("바나나 추가? " + q.offer("바나나"));  //바나나추가하고 true반환
        
        try{
            q.add("체리"); // 큐에 체리를 추가 큐에 용량제한이있을경우 요소 추가 실패하고 illegal예외 발생
        } catch (IllegalStateException e){
        }
        System.out.println("헤드 엿보기 : " + q.peek()); // 큐의 첫번째 요소 번환 peek() 큐가 비어있으면 null 반환
        
        String head = null;

        try {
            head = q.remove(); //첫번째 요소 제거하고 반환  큐가 비어있으면 nosuch 예외 발생
            System.out.println(head + "제거");
            System.out.println("새로운 헤드 : " + q.element()); // 큐의 첫번째 요소 반환  큐가 비어있으면 nosuch예외 발생
        } catch (NoSuchElementException e) {
            
        }
        
        head = q.poll();
        System.out.println(head + " 제거");
        System.out.println("새로운 헤드 : " + q.peek());

        System.out.println("체리 포함? " + q.contains("체리")); //큐에 포함 여부 출력
        System.out.println("사과 포함? " + q.contains("사과"));
    }
}
