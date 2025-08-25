package datetime;

import java.util.Calendar;

public class Ex10_4 {
    public static void main(String[] args) {
        /*
        * add를 사용하면 필드의 값을 원하는 만큼 증가 또는 감소 시킬 수 있기 때문에 add메서드를 이용하면 특정 날짜 또는 시간을 기점으로 해서 일정기간 전 후의 날짜와 시간을 알아낼 수 있다.
        * roll도 지정한 필드의 값을 증가 또는 감소시킬 수 있다. add메서드와 차이점은 다른 필드에 영향을 미치지 않는다.
        * add메서드로 날짜 필드의 값을 31 증가시켰다면 다음 달로 넘어가므로 월 필드의 값도 1증가하지만, roll은 월 필드의 값은 변하지 않고 일만 변경됨
        * -> 하지만 roll에서 달을 변경하면 일에 영향을 미칠 수 있음*/

        Calendar date = Calendar.getInstance();
        date.set(2019, 7, 31); //2019년 8월 31일

        System.out.println(toString(date));
        System.out.println("= 1일 후 =");
        date.add(Calendar.DATE, 1);
        System.out.println(toString(date));

        System.out.println("= 6달 전 =");
        date.add(Calendar.MONTH, -6);
        System.out.println(toString(date));

        System.out.println("= 31일 후 =");
        date.roll(Calendar.DATE, 31);
        System.out.println(toString(date));

        System.out.println("= 31일 후(add) = ");
        date.add(Calendar.DATE, 31);
        System.out.println(toString(date));
    }

    public static String toString(Calendar date) {
        return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일";
    }
}
