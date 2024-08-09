package chap12;

import java.util.Random;
import java.util.Scanner;

public class Game1 {

    public static int getUserAnswer() {
        Scanner in = new Scanner(System.in);
        int nVal = 0;
        System.out.println("==================");
        System.out.println("1. 가위");
        System.out.println("2. 바위");
        System.out.println("3. 보");
        System.out.println("당신의 선택은 : ");
        try{
            nVal = Integer.parseInt(in.nextLine());
        }catch (Exception e){

        }
        return nVal;
    }

    public static boolean checkResult(int nUser, int nComputer) {
        if(nUser == 1 && nComputer == 3) {
            return true;
        }
        else if (nUser == 2 && nComputer == 1) {
            return true;
        }
        else if(nUser == 3 && nComputer == 2) {
            return true;
        }
        return false;
    }


    public static void main(String[] args) {
        int nUser, nComputer;
        Random rand = new Random();
        while (true) {
            nUser = getUserAnswer();
            nComputer = rand.nextInt(3) + 1;
            if(checkResult(nUser, nComputer)) {
                break;
            }

        }
    }
}
