package var.sec01;

public class ValiableExchangeExample {
    public static void main(String[] args) {
        int x = 3;
        int y = 5;
        System.out.println("x: " + x + " y: " + y);

        //변수 두 개를 교환할 때 변수를 하나 더 추가해서 변수의 값을 바꿀 수 있다.
        //여기서 알 수 있는 것은 변수의 데이터는 덮어쓰기가 가능하다는 것이다.
        int temp = x;
        x = y;
        y = temp;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
