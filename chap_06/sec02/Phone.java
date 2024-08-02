package chap_06.sec02;

public abstract class Phone {
    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {
        System.out.println("전원 킴");
    }

    public void turnOff() {
        System.out.println("전원 끔");
    }

    // 상속받는 자식들은 필수적으로 구현해야함
    public abstract void signal();
}
