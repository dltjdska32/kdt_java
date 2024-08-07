package chap10;

public class ExceptionHandling04 {
    public static void main(String[] args) {

        //catch문은 한번만 잡혀야한다.
        // catch문이 2번 잡히면 오류가 발생
        // -> runtimeexception이 상위 클래스 기때문에
        // 현재 runtimexception에서 한번 걸리고
        // array index out of bound exception 에서 한번 더 걸림.
        // 따라서 두 예외의 순서를 바꾸든지 하나를 지워야한다.
        String data = null;
        String data2 = null;

        try {

            data = args[0];
            data2 = args[1];
            // --------예외 발생 catch문으로 이동----------//


            int val = Integer.parseInt(data);
            int val2 = Integer.parseInt(data2);
            System.out.println(val + " + " + val2 + " = " + (val + val2));
        }
        catch (RuntimeException e) {
            System.out.println("숫자로 변환할 수 없음.");

        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("실행 매개값의 수가 부족");
//        }
       finally {
            System.out.println("다시 실행.");
        }
    }
}
