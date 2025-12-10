package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        int m = 10;
        int temp = 0;
        if(m>0){
            temp = m * 2;
            System.out.println("temp = " + temp);
        }
        System.out.println("m = " + m);
    }
    //temp는 m>0큰 경우에만 사용하지만 전역변수에 사용하면 메모리를 비효율적으로 사용하기 때문에 좋지 못한 코드이다.
}
