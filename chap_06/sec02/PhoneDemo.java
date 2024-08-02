package chap_06.sec02;

public class PhoneDemo {
    public static void main(String[] args) {

        //Phone p = new Phone(); -> 추상 클래스 인스턴스화 불가

        Telephone tp = new Telephone("홍길동");

        tp.audioTalk();
        System.out.println("사용자 : " + tp.owner);
        tp.turnOn();
        tp.signal();
        tp.turnOff();

        System.out.println("-----------------------");

        SmartPhone sp = new SmartPhone("고길동");

        sp.audioTalk();
        System.out.println("사용자 : " + sp.owner);
        sp.turnOn();
        sp.signal();
        sp.internetSearch();
        sp.turnOff();

        System.out.println("-----------------------");

        DmbPhone dp = new DmbPhone("고말자");
        dp.turnOn();
        System.out.println("사용자 : " + dp.owner);
        dp.signal();
        dp.turnOff();

    }
}
