package ch14;

import java.util.Arrays;
import java.util.List;

class ResizeableArray{
    private String[] elements;
    private int size;

    // 초기 용량을 전달하여 객체를 생성
    public ResizeableArray(int initialCapacity){
        elements = new String[initialCapacity];
        size = 0;
    }
    // 배열의 마지막에 해당 요소르 추가
    public void add(String elem){
        if(size == elements.length){

            String[] tempList = new String[elements.length + 1];
            for(int i=0; i<elements.length; i++){
                tempList[i] = elements[i];
            }
            elements = tempList;
        }
        elements[size] = elem;
        size++;
    }
    public  String toString(){
        return Arrays.toString(elements);
    }
    public  String get(int index){
        return elements[index];
    }
}



public class ArrayTest {
    public static void main(String[] args){
        // 배열 생성
        ResizeableArray list = new ResizeableArray(2);
//        String[] list = new String[2];

        // 배열에 데이터 추가
        list.add("Apple");
        list.add("Banana");

//        list[0] = "Apple";
//        list[1] = "Banana";

        // 배열 늘리기
//        String[] tempList = new String[list.length*2];
//        for(int i=0; i<list.length; i++){
//            tempList[i] = list[i];
//        }
//        list = tempList;
//        tempList[2] = "Orange";
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Banana");

//        System.out.println(Arrays.toString(list));
        System.out.println("인덱스 1의 요소: " + list.get(1));

        System.out.println(list);
    }
}
