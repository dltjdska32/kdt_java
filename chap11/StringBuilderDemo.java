package chap11;

public class StringBuilderDemo {
    public static void main(String[] args) {
        String s = new String("hi");
        System.out.println(s.hashCode());

        s = s + "!@!@!";                     // 기존 문자열에 문자를 추가하면 새로운 메모리에 할당 -> 기존 메모리는 가비지가 됨.
        System.out.println(s.hashCode());

        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println("sb before capacity -> " + sb.capacity());
        System.out.println("sb before -> " + sb.hashCode());
        sb = sb.append("!!!!!!!!!!!!!!!!!!!!!");                //스트링 빌더로 문자열을 추가할 경우 새로운 저장공간 할당 x 기존 저장공간 이용
        System.out.println("sb after capacity -> " + sb.capacity());
        System.out.println("sb after -> " + sb.hashCode());
    }
}
