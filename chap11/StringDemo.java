package chap11;

public class StringDemo {
    public static void main(String[] args) {

        String ssn = "010624-3123456";

        char gender = ssn.charAt(7);
        switch(gender) {
            case '1' :
            case '3' :
                System.out.println("남자");
                break;
            case '2' :
            case '4' :
                System.out.println("여자");
                break;
        }

        String birthMonth =  ssn.substring(2,4);
        String birthDay = ssn.substring(4,6);
        System.out.println("생일은 " + birthMonth + "월 " + birthDay + "일 입니다.") ;
    }
}
