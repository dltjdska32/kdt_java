package chap10;

public class NumberFormatExceptionEx {
    public static void main(String[] args) {
        String data1 = "100";
        String data2 = "a100";
        
        int value1 = Integer.parseInt(data1);
        int value2 = Integer.parseInt(data2); //number format exception 발생

        System.out.println("value1 = " + value1);
        System.out.println("value2 = " + value2);

        System.out.println("종료");
    }
}
