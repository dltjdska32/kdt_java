package chap_06;


// final 로 선언시 오버라이드 금지됨.
// public final void fly() , public final class 등으로 정의 시 오버라이딩 금지. 상속금지.
public class Airplane {
    public void land() {
        System.out.println("착륙");

    }

    public void fly() {
        System.out.println("일반비행");
    }

    public void takeOff() {
        System.out.println("이륙");
    }
}
