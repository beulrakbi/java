package variable;

public class Var2 {
    public static void main(String[] args) {
        int a; //변수 선언
        a = 10; //변수 초기화

        System.out.println("a = " + a); //변수 a에 담아준 10을 출력
        System.out.println("a = " + a); //변수 a에 담아준 10을 출력
        System.out.println("a = " + a); //변수 a에 담아준 10을 출력

        a = 20; //변수 초기화
        System.out.println("a = " + a);
        System.out.println("a = " + a);
        System.out.println("a = " + a);

        //코딩에서 '='은 대입해주는 것 수학처럼 결과가 같다 라는 의미와는 다름
        //변수의 이름을 적어주면 변수에 담긴 값을 읽어서 사용한다.
    }
}
