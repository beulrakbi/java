package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2*2+3*3;
        int sum4 = (2*2) + (3*3); //우선순위를 명확하게 보이게 하기 위해서 괄호를 작성해서 명확하고 단순하게 작성하는 게 유지보수에 좋다.
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
    }
}
