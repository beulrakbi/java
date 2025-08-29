package collections_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Ex11_5 {
    /*
    * iterator: 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스
    * ListIterator: Iterator에 양방향 조회기능추가(List를 구현한 경우만 사용 가능)
    * EnumEration: lterator의 구버전*/
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator it = list.iterator(); //컬렉션 요소를 하나씩 꺼냄
        /*
        * hasNext(): 다음 요소가 있는지 확인
        * next(): 다음 요소 반환
        * remove(): 현재 요소 삭제*/
        while(it.hasNext()){
            Object obj = it.next();
            System.out.println(obj);
        }

    }
}
