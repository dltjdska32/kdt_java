package chap_06;

class Service{
    public void login() {
        System.out.println("로그인");

    }
}

class MemberService extends Service{

    @Override
    public void login() {
        System.out.println("Member 로그인");

    }
}

class AService extends MemberService{

    @Override
    public void login() {
        System.out.println("AService 로그인");
    }
}

class Controller {
    MemberService service;
    public void setService(MemberService service) {
        this.service = service;
    }
}



public class TestCast {
    public static void main(String[] args) {
        Controller c = new Controller();
        c.setService(new MemberService());
        c.service.login();
        c.setService(new AService());
        c.service.login();

    }
}
