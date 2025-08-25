package collections_framework;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
    static Queue<String> q = new LinkedList<String>(); // 제네릭 추가
    static final int MAX_SIZE = 5;

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while (true) {
            System.out.print(">>");
            try {
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if ("".equals(input)) {
                    continue;
                }

                if (input.equalsIgnoreCase("q")) {
                    System.exit(0);
                } else if (input.equalsIgnoreCase("help")) {
                    System.out.println("help - 도움말을 보여줍니다.");
                    System.out.println("q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println("history - 최근에 입력한 명령어를 " + MAX_SIZE + "개 보여줍니다.");
                    save(input); // help도 history에 포함되도록 save 호출
                } else if (input.equalsIgnoreCase("history")) {
                    save(input);

                    LinkedList<String> tmp = (LinkedList<String>) q; // 제네릭 추가
                    ListIterator<String> it = tmp.listIterator(); // 제네릭 추가

                    int i = 0;
                    while (it.hasNext()) {
                        System.out.println(++i + "." + it.next());
                    }
                } else { // q, help, history가 아닐 경우
                    save(input);
                    System.out.println(input);
                }
            } catch (Exception e) {
                System.out.println("입력 오류입니다.");
            }
        }
    }

    public static void save(String input) {
        if (!"".equals(input)) {
            q.offer(input);
        }

        if (q.size() > MAX_SIZE) {
            q.remove();
        }
    }
}