package chap07;

public class TelevisionDemo {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.turnOn();
        tv.setVolume(20);
        int vl = tv.getVolume();
        System.out.println(vl);
        tv.turnOff();


        Radio r = new Radio();
        r.turnOn();
        r.setVolume(120);
        int vl2 = r.getVolume();
        System.out.println(vl2);
        r.turnOff();
    }
}
