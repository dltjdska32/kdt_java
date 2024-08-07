package chap10;

public class ExceptionHandling06 {

    public static void main(String[] args) {
        method1();
        System.out.println("정상 종료");
    }
    public static void method1() {
        try {
            method2();
        } catch (ClassNotFoundException e) {
            System.out.println("클래스 존재 x");
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public static void method2() throws ClassNotFoundException {
        int n = Integer.parseInt("a11");
        Class clazz = Class.forName("java.lang.Stirng2");
    }
}
