package var.var3;

public class ChartExample {
    public static void main(String[] args) {
        /*
        * 유니코드: 세계 각국의 문자를 0~65535 숫자로 매핑한 국제 표준 규약
        * + 유니코드가 정수이므로 char 타입도 정수에 속한다.
        * + 유니코드 정수를 입력해도 문자를 출력할 수 있다.
        * 65= A*/

        char c1 = 'A';
        char c2 = 65; //유니코드 직접 저장
        char c3 = '가';
        char c4 = 44032; //유니코드 직접 저장

        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);
        System.out.println("c3 = " + c3);
        System.out.println("c4 = " + c4);
    }
}
