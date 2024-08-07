package chap08.sec02;

public class Bus implements Vehicle {

    public String busDriverName = "홍길동";

    public void drive() {
        System.out.println("Bus driving");
    }

    void checkFare() {
        System.out.println("Bus Check fare");
    }
}
