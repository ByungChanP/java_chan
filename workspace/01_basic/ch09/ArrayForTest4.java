package ch09;

import java.util.Scanner;

public class ArrayForTest4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // 사용자의 입력을 받을 때 사용

        // 구구단 결과를 배열로 저장해 출력

    while(true){

        System.out.println("단을 입력하시오");
        int dan = s.nextInt(); // 입력한 값을 int로 꺼내온다.
        int[] result = new int[9]; //입력한 숫자만큼 숫자 길이 가능

        for (int i = 0; i < result.length; i++) {
            result[i] = dan * (i + 1);// dan = 3, i =0이라면 result[0] = 3*1, i=1 result[1] = 3*2
        }

        System.out.println(dan + "단 학습 완료");
        System.out.println("곱할 숫자를 입력하시오(0을 입력하면 종료가 됩니다.");
        int num1 = s.nextInt(); // 입력한 값을 int로 꺼내온다.


        if (num1 <= 0 || num1 > result.length) { //0인경우 강제 종료
            break;

        } else {
            System.out.println(dan + " X " + (num1) + " = " + result[num1 - 1]);
            System.out.println();
        }
    }
        System.out.println("구구단 종료");



//        int[] result = new int[9];
//        int dan = s.nextInt(); // 입력한 값을 int로 꺼내온다.
//        // 구구단 결과를 배열로 저장해 출력
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = dan * (i + 1);// dan = 3, i =0이라면 result[0] = 3*1, i=1 result[1] = 3*2
//
//        }
//        System.out.println("단 학습 완료");
//
//        System.out.println("곱할 숫자를 입력하시오(0을 입력하면 종료가 됩니다.");
//        int num1 = s.nextInt(); // 입력한 값을 int로 꺼내온다.
//        if (num1 == 0) {
//            System.exit(0);
//        } else {
//            System.out.println(dan + " X " + (num1) + " = " + result[num1 - 1]);
//        }
   }
}