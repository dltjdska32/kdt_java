package chap_06.sec02;




public class Telephone extends Phone {
    //생성자
    public Telephone(String owner) {
        //부모클래스 생성자 호출
        super(owner);
    }

    @Override
    public void signal(){
        System.out.println("telephone 신호");
    }

    public void audioTalk() {
        System.out.println("일반 전화 사용");
    }

}
