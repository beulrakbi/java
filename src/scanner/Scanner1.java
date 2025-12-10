package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //자바에서 제공하는 Scanner를 사용한다.

        System.out.print("문자열을 입력하세요: ");
        String str = sc.nextLine();
        System.out.println("입력한 문자열 = " + str);

        System.out.print("정수를 입력하세요: ");
        int intValue = sc.nextInt();
        System.out.println("intValue = " + intValue);

        System.out.print("실수를 입력하세여: ");
        double doubleValue = sc.nextDouble();
        System.out.println("doubleValue = " + doubleValue);
    }
}
