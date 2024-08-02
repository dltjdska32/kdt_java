package chap_06;

public class Computer extends Calculator{

    // 오버라이드 부모함수 재정의
    @Override
    double areaCircle(double radius) {
        System.out.println("Computer 객체 areaCircle함수 실행");
        return Math.PI * radius * radius;
    }

    // 부모 함수 호출
    void method2() {
        super.areaCircle(10);
    }
}
