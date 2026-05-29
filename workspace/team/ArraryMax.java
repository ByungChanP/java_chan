package team;

import java.util.Arrays;

public class ArraryMax {
    public static void main(String[]args){


//        1. 이차원 배열의 최댓값을 구하여라
        int[][] arr = {
                {12, 45, 8, 23},
                {34, 11, 56, 22},
                {9, 41, 17, 30}
        };
        int max = 0;
        for(int i=0; i<arr.length; i++){  // 행
            for(int j=0; j<arr[i].length; j++){ // 열
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
            }
        }
        System.out.println(max);
        System.out.println("다음 문제");


        // 2. 평균 구하고, 합격 데이터만 출력하기
        int[][] studentScores = {
                {90,85,95},
                {50,60,55},
                {80,80,80},
                {70,65,75}
        };

        for(int i=0; i < studentScores.length; i++){
            double avg = 0;
            int sum = 0;
            for(int j=0; j < studentScores[i].length; j++){
                sum += studentScores[i][j];
                avg = (double)sum / studentScores[i].length;
            }
            if(avg >= 80){
                System.out.println(Arrays.toString(studentScores[i]));
            }else{
                continue;
            }
        }
        System.out.println("다음 문제");


        //3. 역순 출력 문제
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for(int i=0; i< arr1.length; i++) { //행의 갯수만큼 반복
            int[][] arr2 = new int[arr1.length][arr1[i].length];
            for (int j = 0; j < arr1[i].length; j++) { //열의 갯수만큼 반복
                arr2[i][j] = arr1[arr1.length - i - 1][arr1[i].length - j - 1];
            }
            System.out.println(Arrays.toString(arr2[i]));
        }

        System.out.println("다른 방안");

        int temp = 0;
        for(int i=0; i< arr1.length/2; i++) { //행의 갯수만큼 반복
            for (int j = 0; j < arr1[i].length; j++) { //열의 갯수만큼 반복
                temp = arr1[i][j];
                arr1[i][j] = arr1[arr1.length - i - 1][arr1[i].length - j - 1];
                arr1[arr1.length - i - 1][arr1[i].length - j - 1] = temp;
            }
            System.out.println(Arrays.toString(arr1[i]));
            System.out.println(Arrays.toString(arr1[arr1.length - 1]));
        }
    }
}