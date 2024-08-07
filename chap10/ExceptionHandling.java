package chap10;

public class ExceptionHandling {

    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";

        try {
            int value1 = Integer.parseInt(data1);
            int value2 = Integer.parseInt(data2); //number format exception 발생
            System.out.println("value1 = " + value1);
            System.out.println("value2 = " + value2);
        }
        // 만약 어떤 예외가 날지 모른다면 catch문의 조건으로 runtimeexception을 조건으로 사용
        catch (NumberFormatException e) {

            System.out.println("Exception: " + e);
        }

        System.out.println("종료");
    }
}
