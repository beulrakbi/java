package variable;

public class Var7 {
    public static void main(String[] args) {
        int a = 100; //정수
        double b = 10.5; //실수
        boolean c = true; //boolean은 true, false 입력 가능
        char d = 'A'; //문자 딱 하나만 넣을 . 있음
        String e = "Hello Java"; //문자열을 다루기 위한 특별한 타입

//        int z = "백원";
        //incompatible types: java.lang.String cannot be converted to int
        //스트링을 int로 바꿀 없다고 에러가 발생

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        //리터럴 : int a = 100; <- 100이 리터럴이다. String e = "Hello Java" <- Hello Java가 리터럴
    }
}
