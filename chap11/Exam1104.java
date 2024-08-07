package chap11;

import java.util.Scanner;

public class Exam1104 {

    public static void main(String[] args) {
        while (true) {
            if (getMenue() == 3) {
                System.out.println("종료합니다.");
                System.exit(0);
            }
        }
    }

    public static int getMenue() {

        int nVal= -1;
        Scanner input = new Scanner(System.in);

        System.out.println("==================================================");
        System.out.println("1. 입력");
        System.out.println("2. 출력");
        System.out.println("3. 나가기");

        System.out.println("메뉴 입력 : ");

        try{
            nVal = Integer.parseInt(input.nextLine());
        } catch(Exception e){
            System.out.println("올바른 선택아님.");
            System.exit(1);
        }

        return nVal;
    }
}
