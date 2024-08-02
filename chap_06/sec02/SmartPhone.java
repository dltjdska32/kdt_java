package chap_06.sec02;


public class SmartPhone extends Phone{
    //생성자
    public SmartPhone(String owner) {
        //부모클래스 생성자 호출
        super(owner);
    }

    @Override
    public void signal() {
        System.out.println("smartphone 신호");
    }

    public void audioTalk() {
        System.out.println("스마트 폰 사용");
    }

    public void internetSearch() {
        System.out.println("인터넷 사용");
    }
}
