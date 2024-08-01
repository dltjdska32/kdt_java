package chap_05;

public class Calculator {
    // static 을 제외한 변수들은 인스턴스할경우 힙에 저장된다.
    // static (정적 필드, 정적 메소드)의 경우 메소드 영역에 저장된다.
    String color;
    static double pi = 3.141592;
    int insVal = 0;
    static int stVal = 10;
    static int count = 0;

    //인스턴스화 될때 마다 count ++ 스태틱이기 때문에 값이 늘어남
    public Calculator() {
        count++;
    }

    static int plus (int a, int b) {
        return a + b;
    }
    static int sub (int a, int b) {
        return a - b;
    }
}
