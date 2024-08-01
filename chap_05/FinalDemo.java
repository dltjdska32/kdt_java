package chap_05;

public class FinalDemo {
    // 프로그램에서 값을 고정해서 쓰려고 하는경우 사용 값 변경 불가.
    static final double MAX_COUNT = 100;
    public static void main(String[] args) {

        System.out.println("pi = " + Math.PI);
        System.out.println("MAX_COUNT = " + MAX_COUNT);


    }
}
