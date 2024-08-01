package chap_05.sec06;

import chap_05.sec05.Kumho;

public class main06 {
    public static void main(String[] args) {
        Kumho k2 = new Kumho();

        //외부 패키지기 때문에 참조불가
//        System.out.println(k2.ndefault);
        //public은 모두 열어줌
        System.out.println(k2.nPublic);
    }
}
