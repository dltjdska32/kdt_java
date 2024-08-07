package chap11;

public class Exam1101 {
    public static void main(String[] args) {
        Member obj1 = new Member("blue");
        Member obj2 = new Member("red");
        Member obj3 = new Member("green");

        String str1 = "홍길동";
        String str2 = "홍길동";
        String str3 = new String("홍길동");

        if (obj1.equals(obj2)) {
            System.out.println("obj1 과 obj2 는 동등");
        } else {
            System.out.println("obj1 과 obj2는 동등하지 않음.");
        }

        System.out.println("obj1 -> " + obj1.hashCode());
        System.out.println("obj2 -> " + obj2.hashCode());
        System.out.println("obj3 -> " + obj3.hashCode());

        System.out.println("str1 -> " + str1.hashCode());
        System.out.println("str2 -> " + str2.hashCode());
        System.out.println("str3 -> " + str3.hashCode());
    }
}
