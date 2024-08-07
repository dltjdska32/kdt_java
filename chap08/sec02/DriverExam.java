package chap08.sec02;

public class DriverExam {

    public static void main(String[] args) {

        Driver driver = new Driver();

        Bus bus = new Bus();
        Taxi taxi = new Taxi();
        System.out.println("강제 형변환 전 ->"+ bus.busDriverName);

        driver.drive(bus);
        driver.drive(taxi);
        System.out.println("강제 형변환 후 ->"+bus.busDriverName);

        Vehicle vehicle2;
        vehicle2 = bus;

        System.out.println("vehicle 2 address : " + System.identityHashCode(vehicle2));


       // vehicle2.checkFare()  직접 사용불가 버스에서 오버라이드 된것이 아니기 때문에
        Bus bus2 = (Bus) vehicle2; // 강제형변환

        System.out.println("bus 2 address : " + System.identityHashCode(bus2));

        System.out.println("bus address : " + System.identityHashCode(bus));

        System.out.println("bus2 address : " + System.identityHashCode(bus2));
        bus2.checkFare();

    }
}
