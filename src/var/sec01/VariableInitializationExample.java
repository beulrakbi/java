package var.sec01;

public class VariableInitializationExample {
    /*
    * Variable: 변수
    * Initialziation: 초기화
    *
    * 변수: 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름
    * -> 자바의 변수는 다양한 타입을 저장할 수 없다. 정수형 타입 변수에는 정수형 데이터만, 실수형 타입 변수에는 실수형 데이터만 저장할 수 있다.
    *
    * int age; -> int는 타입 age는 변수명
    * age = 90; -> '='은 수학에서는 같다와 같은 의미이지만 자바에서는 대입을 뜻한다.
    * */
    public static void main(String[] args) {

        //int value; //변수 선언
        int value1 = 10;
     //연산 결과를 변수 result의 초기값으로 대입
     //int result = value + 10; // value 변수를 초기화 하지 않고 사용할 수 없음
        int result = value1 + 10;
        System.out.println(result);
    }
}
