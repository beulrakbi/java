package collections_framework;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex11_2 {
    public static void main(String[] args) {

        /*
        * 자바에서는 스택을 Stack 클래스로 구현하여 제공하고 있지만 큐는 Queue인터페이스로만 정의해 놓았을 뿐 별도의 클래스 제공하지 않고 있다.*/
        Stack st = new Stack();
        Queue q = new LinkedList(); //Queue인터페이스의 구현체 LinkedList를 사용

        st.push("0");
        st.push("1");
        st.push("2");

        q.offer("1");
        q.offer("2");
        q.offer("3");

        System.out.println("= stack =");
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }

        System.out.println("= queue =");
        while(!q.isEmpty()){
            System.out.println(q.poll());
        }

    }
}
