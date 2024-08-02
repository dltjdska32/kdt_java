package chap_06;

public class ComputerDemo {
    public static void main(String[] args) {

        Computer computer = new Computer();
        Calculator calculator = new Calculator();
        double radious = 10;

        System.out.println("원면적 : " + computer.areaCircle(radious));

        System.out.println("원면적 : " + calculator.areaCircle(radious));
    }

}
