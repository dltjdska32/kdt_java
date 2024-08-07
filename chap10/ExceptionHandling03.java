package chap10;

public class ExceptionHandling03 {

    public static void main(String[] args) {

        String data = null;
        String data2 = null;

        try {
            data = args[0];
            data2 = args[1];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("실행 매개값의 수가 부족");
        }

        try {
            int val = Integer.parseInt(data);
            int val2 = Integer.parseInt(data2);
            System.out.println(val + " + " + val2 + " = " + (val + val2));
        } catch (NumberFormatException e) {
            System.out.println("숫자로 변환할 수 없음.");

        } finally {
            System.out.println("다시 실행.");
        }
    }
}
