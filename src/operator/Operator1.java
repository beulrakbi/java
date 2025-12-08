package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        //덧셈
        int sum = a+b;
        System.out.println("a + b = " + sum); //출력 a + b = 7

        //뺄셈
        int diff = a-b;
        System.out.println("a - b = " + diff);

        //곱셈
        int multi = a*b;
        System.out.println("a*b = " + multi);

        //나눗셈
        int div = a/b;
        System.out.println("a/b = " + div);
        //결과가 2.5가 나와야 하지만 int / int는 소수점 뒤로 나오지 않는다.
        
        //나머지 
        int mod = a%b;
        System.out.println("mod = " + mod);

//        int z = 10/0;
//        System.out.println("z = " + z);
        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at operator.Operator1.main(Operator1.java:29)
	    0으로 나누면 예외가 발생한다.*/
    }
}
