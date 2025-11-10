package var;

import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //Scanner를 생성해서 화면으로 부터 입력받기
        int input = scanner.nextInt();
        System.out.println("input = " + input);
    }
}
