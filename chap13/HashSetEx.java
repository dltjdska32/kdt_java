package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx {
    public static void main(String[] args) {

        Set<String> set = new HashSet<String>();
        
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("B");// 중복 데이터
        
        int size = set.size();

        System.out.println("총 객체수: " + size);
        
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        for (String s : set) {
            System.out.println(s);
        }
        
        set.clear();
        if(set.isEmpty()) System.out.println("비어있음");
    }
}
