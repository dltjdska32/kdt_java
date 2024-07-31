public class StringEqualsExample {

    public static void main(String[] args) {
        // 신민철이라는 힙 영역 주소를 공유
        String strVar1 = "신민철";
        String strVar2 = "신민철";

        // strVar1과 strVar2의 주소가 같은지 확인
        if(strVar1 == strVar2) {
            System.out.println("strVar1 과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1 과 strVar2는 참조가 다름");
        }

        //equals() 함수를 통해서 실제 값이 같은지 확인  주소확인x
        if(strVar1.equals(strVar2)) {
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        // 서로 다른 주소에 String 객체 생성(힙영역)
        String strVar3 = new String("신민철");
        String strVar4 = new String("신민철");


        // var3과 var4는 서로다른 힙영역에 생성되어 주소가 다름
        if(strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) {
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }

        System.out.printf("strVar1 주소 : %x\n", System.identityHashCode(strVar1));
        System.out.printf("strVar2 주소 : %x\n", System.identityHashCode(strVar2));
        System.out.printf("strVar3 주소 : %x\n", System.identityHashCode(strVar3));
        System.out.printf("strVar4 주소 : %x\n", System.identityHashCode(strVar4));

        //strVar4의 주소값을 strVar1의 주소값으로 바꿈 따라서 이전 strVar4의 값은 가비지 컬랙터가 제거함.
        strVar4 = strVar1;
        System.out.printf("변경된 strVar4 주소 : %x\n", System.identityHashCode(strVar4));
    }
}
