package ch10;

import java.util.Arrays;

public class ArrayCopyMethod {

    //전달받은 배열의 모든 요소를 출력하는 메서드
    static void printArr(int[] arr, String name){
//        System.out.print(name + ": ");{
//        for(int i=0; i< arr.length; i++){
//            System.out.print(arr[i] + " ");
        for(int elem : arr){
            System.out.print(name + ": ");
            System.out.print(elem + " | ");
        }
        System.out.println();
    }

    // 원본 배열과 복사 배열을 출력한 후 값을 수정하고 다시 출력한다.
    static void testArr(int[] original, int[] shallow){
        //  printArr 메서드를 호출하여 모든 요소를 출력한다.
        printArr(original, "원본 배열");
        printArr(shallow, "복사 배열");

        // shallow[0] 값을 수정
        System.out.println();
        shallow[0] = 99;


        printArr(original, "원본 배열");
        printArr(shallow, "복사 배열");
        System.out.println();
    }

    public static void main(String[]args) {

        // 1. 얕은 복사
        System.out.println("---얕은 복사 + 수동 복사 (for문 사용)---");
        int[] original = {10, 20, 30};
        int[] shallow = original;

        testArr(original, shallow);

        // 2. 깊은 복사 + 수동으로 복사 (for문 사용)
        System.out.println("---깊은 복사 + 수동 복사 (for문 사용)---");
        original = new int[]{10, 20, 30};
        shallow = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            shallow[i] = original[i];

        }

        testArr(original, shallow);

        // 3. 깊은 복사 (System.arraycopy() 이용) 디테일한 배열 복사를 이용할경우
        System.out.println("---깊은 복사 + System.arraycopy() 이용---");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = new int[original.length];

        // 원본 배열, 0번 인덱스부터, shallow 배열에, 0번 인덱스부터, origianl 길이 만큼 복사해줘
        System.arraycopy(original, 0, shallow, 0, original.length);

        testArr(original, shallow);


        // 4. 깊은 복사 arrayys.copyof() 이용)
        System.out.println("---깊은 복사 + arrayys.copyof() 이용---");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = Arrays.copyOf(original, original.length);
        testArr(original, shallow);
    }
}
