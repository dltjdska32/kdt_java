import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        boolean run = true;
        int balance = 0;
        Scanner sc = new Scanner(System.in);

        while (run) {
            System.out.println("-------------------------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice){
                case 1:
                    System.out.println("입금할 금액을 입력하세요.");
                    balance += Integer.parseInt(sc.nextLine());
                    break;

                case 2:
                    System.out.println("출금할 금액을 입력하세요.");
                    int withdraw = Integer.parseInt(sc.nextLine());
                    if( balance < withdraw){
                        System.out.println("잔액이 부족합니다. 잔액을 확인해주세요.");
                        break;
                    }
                    balance -= withdraw;
                    break;

                case 3:
                    System.out.println("잔고는 " + balance + "원 입니다");
                    break;

                case 4:
                    System.out.println("종료합니다.");
                    run = false;
                    break;

                default:
                    System.out.println("번호를 잘못 입력하셨습니다.");
                    break;
            }
        }
    }
}
