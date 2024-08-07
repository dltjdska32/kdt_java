package chap11;

import java.util.HashMap;

public class Exam1102 {

    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<>();

        hashMap.put(new Key(1), "홍길동");

        String value = hashMap.get(new Key(1));

        Key key1 = new Key(10);
        Key key2 = new Key(20);
        System.out.println(value);
        System.out.println(key1.toString());
        
        if(key1.equals(key2)){
            System.out.println("동일");
            
        } else {
            System.out.println("성동일");
        }
    }
}
