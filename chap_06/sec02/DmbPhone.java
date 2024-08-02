package chap_06.sec02;

public class DmbPhone extends Phone {

    public DmbPhone (String owner) {
        super(owner);
    }

    @Override
    public void signal() {

        System.out.println("dmb 신호");
    }
}
