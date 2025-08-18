package datetime;

import java.util.Calendar;

public class Ex10_1 {
    public static void main(String[] args) {
        Calendar today = Calendar.getInstance(); //현재 날짜와 시간의 정보를 가져온다. (객체 생성

        System.out.println("이 해의 년도: " + today.get(Calendar.YEAR));
        System.out.println("월 (0~11, 0:1월) " + today.get(Calendar.MONTH)); //나오는 값의 + 1이 지금 달
        System.out.println("이 해의 몇 째 주 : "
                                 + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주 : "
                                + today.get(Calendar.WEEK_OF_MONTH));

        //DATE == DAY_OF_MONTH
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇일: " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1~7, 1: 일요일)" +
                                    today.get(Calendar.DAY_OF_WEEK));
        System.out.println("이 달의 몇 째 요일: " +
                                    today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("오전_오후 (0오전, 1오후)" +
                                    today.get(Calendar.AM_PM));
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
        System.out.println("초: " + today.get(Calendar.SECOND));
        System.out.println("1000분의 1초(0~999)" +
                today.get(Calendar.MILLISECOND));
        //천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.
        System.out.println("TimeZone(-12 ~ +12): " +
                today.get(Calendar.ZONE_OFFSET));
        System.out.println("이 달의 마지막 날: " +
                today.getActualMaximum(Calendar.DATE));
    }
}
