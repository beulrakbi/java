package scope;

public class Scope1 {
    public static void main(String[] args) {
        int m = 10; //생존 시작
        if(true){
            int x = 20; //x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } //x 생존 종료
//        System.out.println(x); //x 변수의 생존이 종료가 되었기 때문에 변수를 사용할 수 없다.
        System.out.println(m);
    } //m 종료
}
