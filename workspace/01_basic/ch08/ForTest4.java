package ch08;

import java.util.Scanner;

public class ForTest4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in); // 사용자의 입력을 받을 때 사용
        int dan = s.nextInt(); // 입력한 값을 int로 꺼내온다.
        int num1 = s.nextInt(); // 입력한 값을 int로 꺼내온다.
        System.out.println("입력한 값: " + dan + " X " + num1 + " = " + (dan*num1));



        for(int i = 0; i <= 9; i++){
            System.out.println(dan + " X " + i + " = " + (dan*i));
        }
    }
}