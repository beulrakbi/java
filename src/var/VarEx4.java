package var;

public class VarEx4 {
    public static void main(String[] args) {
        final int Max_VALUE = 100;
        //Max_VALUE = 200; //에러 발생 상수는 한 번만 값을 저장할 수 있다.

        char ch = 'a';
//        char = ''; //공백이라도 저장해야 에러 안남

        String str = "java";
        str = ""; //0개의 문자 저장 가능

        System.out.println(7+"");
        System.out.println(7+7+"");

        String block = """
                Hello
                World
        """; //닫는 위치에 따라 공백이 생긴다.
        System.out.println(block);


    }
}
