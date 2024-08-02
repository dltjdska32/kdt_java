package chap_06.sec01;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();

        Parent parent = child;
        parent.method1(); // -> parent클래스의 method1을 실행
        parent.method2(); // -> 자식 클래스의 method2 실행 (오버라이드된)
//        parent.method3(); -> method3은 호출 불가 오버라이드 안됐기 때문에

    }
}
