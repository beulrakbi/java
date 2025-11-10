package Chap10;

import java.util.Calendar;

public class Ex10_1 {
    public static void main(String[] args) {
        /*
        * 추상 클래스는 인스턴스를 생성할 수 없다.
        * Calendar cal = new Calendar(); 에러 발생
        * Calendar cal = Calendar.getInstance(); 사용 가능
        * 메서드를 통해서 인스턴스를 반환받게 하는 이유는 최소한의 변경으로 프로그램이 동작할 수 있게 하기 위한 것*/

        //기본적으로 현재의 날짜가 저장된다.
        Calendar today = Calendar.getInstance();
        System.out.println("올해 연도: " + today.get(Calendar.YEAR));
        System.out.println("월: " + today.get(Calendar.MONTH)); //0이 1월 기준이다. 현재 기준 2025년 11월 -> 출력 10월
        System.out.println("이 해의 몇 째 주:" + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇째 주: " + today.get(Calendar.WEEK_OF_MONTH));

        //Date == DAY_OF_MONTH
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));

        System.out.println("요일: " + today.get(Calendar.DAY_OF_WEEK)); //1 == 일요일, 2 == 월요일
        System.out.println("오전_오후: " + today.get(Calendar.AM_PM)); //0오전, 1오후
        System.out.println("시간: "+ today.get(Calendar.HOUR));
        System.out.println("시간: "+ today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분: " + today.get(Calendar.MINUTE));
        System.out.println("초: " + today.get(Calendar.SECOND));
        System.out.println("1000분의 1초: " + today.get(Calendar.ZONE_OFFSET));
        System.out.println("TimeZone(-12 ~ +12): " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("이 달의 마지막 날: "+ today.getActualMaximum(Calendar.DATE));
    }
}
