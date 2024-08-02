package chap_06;

public class AirplaneDemo {
    public static void main(String[] args) {

        SuperSonicAirplane sa = new SuperSonicAirplane();

        sa.takeOff();
        sa.fly();
        sa.flyMode = sa.SUPER;
        sa.fly();
        sa.land();
    }
}
