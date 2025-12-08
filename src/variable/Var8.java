package variable;

public class Var8 {
    public static void main(String[] args) {
        //정수
        byte b = 127; //-128~127까지 저장 가능
        short s = 32767; //-32768 ~ 32767까지 저장 가능
        int i = 2147483647; //-2147483648 ~ 2147483647 (약 20억)
        long l = 9223372036854775807L; //대문자 L을 마지막에 붙여준다.

        //실수
        float f = 10.0f; //f를 마지막에 붙여준다.
        double d = 10.0; // 더블이 더 큰 숫자를 입력 가능하다.

        // 주로 int, double 사용
        //char 문자 1개
        //리터럴들은 각 타입의 유효범위 이상으로 넘어가면 오류가 발생한다.
        //외울 필요 없이 이해만 하고 넘어가야 함
        //int, double, boolean, String을 자주 쓰도록 하자
    }
}
