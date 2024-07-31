import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
//        float var1 = 10f;
//        float var2 =  var1 / 100;
//        if(var2 >= 0.1) {
//            System.out.println("10%");
//        } else {
//            System.out.println("10% 아님");
//        }

//        int lenTop = 5;
//        int lenBottom = 10;
//        int height = 7;
//        double area = (double) (lenTop + lenBottom) * height / 2;
//        System.out.println(area);

        Scanner in = new Scanner(System.in);
        System.out.print("첫 번째 수: ");
        float a = in.nextFloat();
        System.out.print("두 번째 수: ");
        float b = in.nextFloat();

        if( a / b > 0) {
            System.out.println(a/b);
        } else if(a / b == 0) {
            System.out.println("무한대");
            
        }
    }
}
