package chap_06.sec01;

public class Parent {
    void method1() {
        System.out.println("method1");
    }
    void method2() {
        System.out.println("method2");
    }

}

class Child extends Parent {
    @Override
    void method2() {
        System.out.println("child method2");
    }
    void method3() {
        System.out.println("child method3");
    }

}
