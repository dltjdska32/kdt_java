package chap_05;

import java.sql.SQLOutput;

public class CalculatorDemo {
    int n;
    public static void main(String[] args) {
      //  n = 10; 0
        double radious = 10.0;

          System.out.println(radious * Calculator.pi);
          //-> 스태틱의 경우 인스턴스화를 하지않아도 클래스 변수를 사용할 수있따.
        // 메모리에 값을 할당했기 때문에
   //     System.out.println(Calculator.color);

        Calculator c1 = new Calculator();
        Calculator c2 = new Calculator();

        //인스턴스 변수
        //인스턴스 변수는 객체를 생성하면 각각의 객체마다 해당 변수의  값을 가진다.
        c1.insVal = 10;
        c2.insVal = 20;
        System.out.println("c1 insVal : " + c1.insVal);
        System.out.println("c2 insVal : " + c2.insVal);

        //스태틱 변수는 하나를 생성하면 객체를 여러개 생성해도 하나의 변수값만 가짐
        c1.stVal = 10;
        c2.stVal = 20;
        System.out.println("c1 stVal : " + c1.stVal);
        System.out.println("c2 stVal : " + c2.stVal);

        System.out.println("c1 stval : " + c1.stVal);
        c1.stVal = 5;
        c2.stVal = 20;
        Calculator c3 = new Calculator();
        System.out.println("c1 stval : " + c1.stVal);
        System.out.println("c2 stval : " + c2.stVal);
        System.out.println("c3 stVal : " + c3.stVal);

        System.out.println("instance count : " + Calculator.count);

        System.out.println("2 + 3 = " + Calculator.plus(2, 3));
        System.out.println("2 + 3 = " + c1.plus(2, 3));
        System.out.println("2 - 3 = " + Calculator.sub(2, 3));

    }
}
