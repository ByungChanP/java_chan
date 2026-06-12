package ch10;

import java.util.Scanner;

public class MethodOverloading {
    void main() {
        int[] scores = {89, 79, 79};
        System.out.println(toString(scores));

        double[] scores2 = {12.0, 45.6};
        System.out.println(toString(scores2));

        String[] names = {"haru", "namu", "brong"};
        System.out.println(toString(names));
        // 배열 내부의 모든 요소 값들을 문자열로 반환한다.
        // [34, 3, 45, 4, 5]
    }
    String toString(int[] arr){
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            // 문자열 더하기는 결합
            // 문자열 마지막은 쉼표를 붙여서는 안됨
            if (i < arr.length - 1) {
                result += arr[i] + ", ";
            } else {
                result += arr[i];
            }
        }
        result += "]";
        return result;
    }
    String toString (double[] arr){
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            // 문자열 더하기는 결합
            // 문자열 마지막은 쉼표를 붙여서는 안됨
            if (i < arr.length - 1) {
                result += arr[i] + ", ";
            } else {
                result += arr[i];
            }
        }
        result += "]";
        return result;
    }
    String toString (String[] arr) {
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            // 문자열 더하기는 결합
            // 문자열 마지막은 쉼표를 붙여서는 안됨
            if (i < arr.length - 1) {
                result += arr[i] + ", ";
            } else {
                result += arr[i];
            }
        }
        result += "]";
        return result;
    }
}
