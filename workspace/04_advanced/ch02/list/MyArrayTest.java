package ch02.list;

public class MyArrayTest {
    void main(){
    //    MyArray arr = new MyArray();
//        MyArray arr = new MyArray(5);
//
//        arr.append(10);
//        arr.append(20);
//        arr.append(30);
//        arr.append(40);
//        arr.append(2, 25);
//        arr.delete(1);
//
//        System.out.println("2번 인덱스 값: " + arr.getElem(2));
//        System.out.println("3번 인덱스 값: " + arr.getElem(3));
//        System.out.println("-1번 인덱스 값: " + arr.getElem(-1));
//        System.out.println(arr);

        // 10개의 요소를 담을 수 있는 MyArray 객체를 생성한다.
        MyArray arr = new MyArray();
        // MyArray에 데이터 0 ~ 데이터 4까지의 문자열을 담는다.
        for(int i=0; i<5 ; i++){
            arr.append("데이터" + i);
        }

        // MyArray에 담긴 모든 요소를 출력한다.
        System.out.println(arr);
        // MyArray에 0번째 요소를 출력한다.
        System.out.println("0번째 인덱스 값: " + arr.getElem(0));
        // index 2를 삭제한다.
        arr.delete(2);
        // MyArray에 담긴 모든 요소를 출력한다.
        System.out.println(arr);
        // index2에 데이터 5를 삽입한다.
        arr.append(2,"데이터-5");
        //  MyArray에 담긴 모든요소를 출력
        System.out.println(arr);
        // 마지막 위치에 데이터-6을 추가한다.
        arr.append("데이터-6");
        System.out.println(arr);
        //MyArray에 담긴 요소의 갓수를 출력한다. 6
        System.out.println(arr.size());
    }
}
