package chap_05.sec05;

public class main05 {
    public static void main(String[] args) {
        Kumho k1 = new Kumho();

        //default 타입은  내부 패키지에서는 참조가능
        System.out.println(k1.ndefault);

        // private로 설정한 nPrivate변수는 외부에서 참조 불가
//        System.out.println(k1.nPrivate);

    }
}
