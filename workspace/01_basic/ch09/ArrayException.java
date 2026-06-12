package ch09;

import java.sql.SQLOutput;

public class ArrayException {
    public static void main(String[]args){
        // 1. NullPointerException
        String[] strArr = {"이걸", "너는", "알고있나"};
        System.out.println(strArr[0]);

//        int[] ageArr = null;
//        System.out.println(ageArr[0]);
//
//        System.out.println("main 실행 완료");

        // 2. ArrayIndexOutOfBoundsException
//        System.out.println(strArr[3]);
        System.out.println("main 실행 완료");


    }
}
