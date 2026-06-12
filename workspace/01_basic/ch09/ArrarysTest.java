package ch09;

import java.util.Arrays;

public class ArrarysTest {
    public static void main(String[]args){
        int[] arr = { 3, 6, 7, 8, 5, 3, 5, 6, 8, 2, 3};
        int[] arr2 = {1, 2, 3};
        int[] arr3 = {2, 1, 3};
        int[] arr4 = {1, 2, 3};
        // 1. arr의 모든 요소를 출력하시오
        for(int i=0; i<arr.length; i++){
            System.out.println(i + "번째 인덱스: " + arr[i]);
        }
        for(int prin : arr){
            System.out.print(prin + ", ");
        }
        System.out.println();

        // 2. (arr2와 arr3) 다름, (arr2와 arr4) 같음
        boolean isEqual = true;
        for(int i=0; i< arr2.length; i++){
            if(arr2[i] != arr3[i]){
                isEqual = false;
                break;
            }
        }
        System.out.println(isEqual);

        for(int i=0; i< arr2.length; i++){
            if(arr2[i] != arr4[i]){
                isEqual = false;
                break;
            }else {
                isEqual = true;
            }
        }
        System.out.println(isEqual);

        ///쉬운 방법
        System.out.println("arr2,arr3: " + Arrays.equals(arr2, arr3));
        System.out.println("arr2,arr4: " + Arrays.equals(arr2, arr4));

        System.out.println();




//        같이 변경됨
//        arr2 = new int[]{3,6,7};
//        arr3 = arr2;
//        arr3[0] = 5;
//        for(int i=0; i<arr2.length; i++){
//            System.out.println(i + "인덱스의 arr2: " + arr2[i] + ", arr3: " + arr3[i]);
//        }
//        System.out.println();
//        //다르게 변경됨
//        arr2 = new int[]{3,6,7};
//        arr4 = Arrays.copyOf(arr2, arr2.length);
//        arr4[0] = 5;
//        for(int i=0; i<arr2.length; i++) {
//            System.out.println(i + "인덱스의 arr2: " + arr2[i] + ", arr3: " + arr4[i]);
//        }

        // 3. arr 요소의 최소값 최댓값 구하기
        arr = new int[]{ 3, 6, 7, 8, 5, 3, 5, 6, 8, 2, 9};
        int min = arr[0];
        int max = arr[0];
        for(int i =1; i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        for(int i=0; i< arr.length; i++){
            for(int k=0; k<arr.length; k++){
                if(arr[i] < arr[k]){
                    max = arr[k];
                } else if(arr[i] > arr[k]){
                    min = arr[k];
                } else {
                    continue;
                }
            }
        }
        System.out.println("max: " + max);
        System.out.println("min: " + min);

        System.out.println();

        Arrays.sort(arr);
        System.out.println("최솟값: " + arr[0]);
        System.out.println("최댓값: " + arr[arr.length -1]);
        System.out.println();

        // 4. arr 요소를 오름차순으로 정렬하시오
        arr = new int[]{ 3, 6, 7, 8, 5, 3, 5, 6, 8, 2, 3};
        int swap = 0;
        for(int i = 0; i < arr.length - 1 ; i++) {
            for (int k = 0; k < arr.length -1; k++) {
                if(arr[k] > arr[k+1]) {
                    swap = arr[k];

                    arr[k] = arr[k + 1];

                    arr[k + 1] = swap;

                }else{
                    continue;
                }
            }
        }
        for(int j=0; j<arr.length; j++) {
            System.out.print(arr[j]);
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}