package chap10;

public class ExceptionHandling05 {
    public static void main(String[] args) {
        method1();
    }
    public static void method1() {
        try {
            method2();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스 존재 x");
        }
    }

    public static void method2() throws ClassNotFoundException {
        Class clazz = Class.forName("java.lang.Stirng2");
    }
}
