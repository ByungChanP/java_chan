package ch02;

import java.util.*;

public class CollectionTest {
    void main(String[] args){
//        String[] fruits = new String[5]{"바나나", "사과", "오렌지", "파인애플", "수박"};
//        fruits[0] = "바나나";
//        fruits[1] = "사과";
//        fruits[2] = "오렌지";
//        fruits[3] = "파인애플";
//        fruits[4] = "수박";

//         set -> 데이터 중복 x , 저장한 순서 x(자동 정렬)
//        ArrayList <String> fruits = new ArrayList<String>();  // 중복 허용, 순서대로 출력
//        LinkedList<String> fruits =  new LinkedList<>();      //
//        Vector<String> fruits =  new Vector<>();              // 저장한 순서와는 상관없이 나옴
//        HashSet<String> fruits =  new HashSet<>();            // 데이터 중복 x, 저장한 순서가 아닌 자동 정렬하여 출력
//        TreeSet<String> fruits =  new TreeSet<>();            // 정렬하여 출력, 중복 x
        LinkedHashSet<String> fruits = new LinkedHashSet<>(); // 순서대로 출력, 중복 x



        fruits.add("바나나");
        fruits.add("사과");
        fruits.add("오렌지");
        fruits.add("파인애플");
        fruits.add("수박");
        fruits.add("사과");



//        printFruit(fruits); // 배열 전용
//        printFruit1(fruits);
//        printFruit2(fruits);
//        printFruit3(fruits);
//        printFruit4(fruits);
//        printFruit5(fruits);
//        printFruit6(fruits);
        printFruit7(fruits);
    }
    // 전달받은 과일목록을 출력
    void printFruit(String[] fruits){

        for(int i=0; i < fruits.length-1; i++){
            System.out.print(fruits[i] + ", ");
        }
        System.out.println(fruits[fruits.length-1]);
    }
    void printFruit1(ArrayList<String> fruits){
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
    void printFruit2(LinkedList<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    void printFruit3(Vector<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    void printFruit4(HashSet<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    void printFruit5(TreeSet<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    void printFruit6(LinkedHashSet<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
    // Collection -> set, List의 부모 인터페이스
    void printFruit7(Collection<String> fruits) {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
