package chap_04;

import java.util.Calendar;

public class EnumDemo {
    public static void main(String[] args) {
        Week today = null;

        Calendar cal = Calendar.getInstance();
        //일요일 부터 시작해서 오늘까지 몇번째 날짜인지 가져옴
        int nWeek = cal.get(Calendar.DAY_OF_WEEK);

        System.out.println(nWeek);

        switch (nWeek) {
            case 1 :
                today = Week.SUNDAY;
                break;
            case 2 :
                today = Week.MONDAY;
                break;
            case 3 :
                today = Week.TUESDAY;
                break;
            case 4 :
                today = Week.WEDNESDAY;
                break;
            case 5 :
                today = Week.THURSDAY;
                break;
            case 6 :
                today = Week.FRIDAY;
                break;
            case 7 :
                today = Week.SATURDAY;
                break;
        }

        System.out.println(today);
        
        if (today == Week.SUNDAY) {
            System.out.println("오늘은 쉬는날");
        } else {
            System.out.println("오늘은 일하는 날");
        }
    }
}
