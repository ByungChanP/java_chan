package ch02.list;

public class MyLinkedListTest {
    void main() {


        // 10개의 요소를 담을 수 있는 MyArray 객체를 생성한다.
        MyLinkedList arr = new MyLinkedList();
        // MyLinkedList 데이터 0 ~ 데이터 4까지의 문자열을 담는다.
        for (int i = 0; i < 5; i++) {
            arr.appendTo("데이터" + i);
        }

        // MyLinkedList 담긴 모든 요소를 출력한다.
        System.out.println(arr);
        // MyLinkedList 0번째 요소를 출력한다.
        System.out.println("0번째 인덱스 값: " + arr.get(0));
        // index 2를 삭제한다.
        arr.remove(2);
        // MyLinkedList 담긴 모든 요소를 출력한다.
        System.out.println(arr);
        // index2에 데이터 5를 삽입한다.
        arr.appendTo(2, "데이터-5");
        //  MyLinkedList 담긴 모든요소를 출력
        System.out.println(arr);
        // 마지막 위치에 데이터-6을 추가한다.
        arr.appendTo("데이터-6");
        System.out.println(arr);
        //MyLinkedList 담긴 요소의 갓수를 출력한다. 6
        System.out.println(arr.size());

    }
}
