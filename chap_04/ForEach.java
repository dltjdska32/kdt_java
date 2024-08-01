package chap_04;

public class ForEach {
    public static void main(String[] args) {
        int[] oldIntArray = {1,2,3};
        int[] copyArray = new int[5];

        System.out.println("arraycopy() 함수 사용");
        // oldIntArray 의 0번째 인덱스부터 oldIntArray의 길이만큼 copyArray의 방에 2번 방부터 복사
        System.arraycopy(oldIntArray,0,copyArray,2, oldIntArray.length);

        for(int i = 0; i < copyArray.length; i++){
            System.out.print(copyArray[i] + " ");
        }

        System.out.println("\nfor-each문 사용");
        //for each 문
        for(int i : copyArray){
            System.out.print(i + " ");
        }
    }

}
