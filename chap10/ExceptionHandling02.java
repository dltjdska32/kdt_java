package chap10;

public class ExceptionHandling02 {

    public static void main(String[] args) {
        try {
            // Class.forName()을통해 스트링 클래스를 clazz에 넣음
            Class clazz = Class.forName("java.lang.String");

            //class not found 발생
            Class clazz2 = Class.forName("java.lang.String222222");
        }
        catch (ClassNotFoundException e) {
            System.out.println("class not found");
        }
        System.out.println("종료");
    }
}
