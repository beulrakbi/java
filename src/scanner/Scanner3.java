package scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 입력 수: ");
        int num1 = sc.nextInt();
        System.out.println("두 번째 입력 수: ");
        int num2 = sc.nextInt();

        if(num1 == num2){
            System.out.println("두 수는 같은 숫자입니다.");
        } else {
            System.out.println("두 숫자는 다른 숫자입니다.");
        }
    }
}
