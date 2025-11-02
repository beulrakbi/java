package var;

public class var2 {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int tmp; // 값을 바꾸기 위한 변수 선언

        //x y 값 바꾸기
        tmp = x;
        x = y;
        y = tmp;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
