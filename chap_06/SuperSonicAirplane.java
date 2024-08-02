package chap_06;

public class SuperSonicAirplane extends Airplane {
    public static final int NORMAL = 1;
    public static final int SUPER = 2;

    public int flyMode = NORMAL;

    @Override
    public void fly() {
        if (flyMode == SUPER) {
            System.out.println("초음속 비행");
        } else {
            super.fly();
        }
    }
}
