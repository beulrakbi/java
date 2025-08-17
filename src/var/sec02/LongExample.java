package var.sec02;

public class LongExample {
    public static void main(String[] args) {
        long var1 =10;
        long var2 =20L;
//        long var3 =1000000000000; L이 없어서 컴파일러가 L로 인지한다.
        long var4 =1000000000000L;

        System.out.println("var1 = " + var1);
        System.out.println("var2 = " + var2);
        System.out.println("var4 = " + var4);
    }
}
