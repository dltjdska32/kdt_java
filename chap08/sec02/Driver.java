package chap08.sec02;

import chap08.sec01.Car;

public class Driver{

    public void drive(Vehicle vehicle){
        //인터페이스를 통해 넘어온게 버스라면
        if (vehicle instanceof Bus){
            // 강제 형변환을 한 후,
            Bus bus = (Bus)vehicle;
            bus.busDriverName = "이순신";
            bus.checkFare();
        }

        vehicle.drive();
    }
}
