package casting;

public class Casting1 {
    public static void main(String[] args) {
        //자동 형변환
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue; //인트의 값을 롱에 넣어줌
        System.out.println("longValue = " + longValue);

        doubleValue = intValue; //double에 int를 넣는 것도 가능하다.
        System.out.println("doubleValue = " + doubleValue);

        doubleValue = 20L; //long -> double
        System.out.println("doubleValue = " + doubleValue);

        // 작은 범위에서 큰 범위로의 대입은 자바 언어에서 허용한다.
    }
}
