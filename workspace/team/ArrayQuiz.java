package team;

import java.util.Scanner;

public class ArrayQuiz {
    public static void main(String[] args){
        //문제 3 최댓값 찾기
        int[ ] arr = {8, 3, 15, 2, 9};
        int[] max = new int[1];
        int swap;
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){

                swap = arr[i];

                arr[i] = arr[i+1];

                arr[i+1] = swap;

                max[0] = arr[i+1];

            } else {
                continue;
            }
        }
        System.out.println(max[0]);

        // 배열안에 특정 숫자가 있는지 검사하시오
        System.out.println();
        System.out.println("배열안에 특정 숫자 찾기");
        int[] arr1  = {5,8,2,10,7};
        System.out.println("숫자를 입력하시오");
        System.out.println();

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        System.out.println("검사를 시작합니다.");
        System.out.println();

        for(int j=0; j < arr1.length  ; j++) {
            if (num == arr1[j]) {
                System.out.println("인덱스 " + j + "에서 찾았습니다.");
                break;
            } else {
                System.out.println("인덱스 " + j + "에 없습니다.");
            }
        }
        // 서로 다른 숫자가 몇 개인지 구하시오
        System.out.println();
        System.out.println("서로 다른 갯수 구하기");
        int[] arr2 = new int[]{1,2,2,3,4,4,5};
        int cnt = 1;
        for(int k = 0; k < arr2.length -1; k++){
            if( arr2[k] != arr2[k+1] ){
                cnt++;
            }else{
                continue;
            }
        }
        System.out.println(cnt);
    }
}