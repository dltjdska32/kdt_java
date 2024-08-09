package chap12;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date now = new Date();
        String strNow = String.valueOf(now);
        System.out.println(strNow);

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
        String strNow2 = sdf.format(now);
        System.out.println(strNow2);
    }
}
