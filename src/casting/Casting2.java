package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intValue = 0;
//        intValue = doubleValue; //컴파일 오류 발생 java: incompatible types: possible lossy conversion from double to int
        intValue = (int) doubleValue; //1.5를 int로 형변환 하면 1
        //doubleValue의 값은 바뀌지 않는다. = 대입연산자를 사용했을 때 변경된다.
        System.out.println("intValue = " + intValue);
        System.out.println((int)10.5);
        System.out.println(doubleValue);
    }
}
