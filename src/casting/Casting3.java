package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; //int 최고값
        long maxIntOver = 2147483648L; //int 초과해서 L을 안 붙이면 에러 발생
        int intValue =0;

        intValue = (int)maxIntValue; //상 -> 하로 내려갈 때는 무조건 명시적 Casting을 해줘야 함
        System.out.println("intValue = " + intValue);

        intValue = (int)maxIntOver;
        System.out.println("intValue = " + intValue); //초과한 경우에 인트의 가장 작은 숫자부터 다시 시작
    }
}
