package ch09;

import java.util.Arrays;

public class ArrayCopy {
    public static void main(String[]args){

        // 1. 얕은 복사
        System.out.println("---얕은 복사 + 수동 복사 (for문 사용)---");
        int[] original = {10, 20, 30};

        int[] shallow = original;

        // 배열의 모든 요소를 추가해보자
        for(int i=0; i< original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }

        System.out.println();
        // shallow[0] 값을 수정
        shallow[0] = 99;

        // 복사본 수정시 원본도 변경되는 문제점이 발생한다.
        for(int i=0; i< original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }
        System.out.println();

        // 2. 깊은 복사 + 수동으로 복사 (for문 사용)
        System.out.println("---깊은 복사 + 수동 복사 (for문 사용)---");
        original = new int[]{10, 20, 30};
        shallow = new int[original.length];
        for (int i=0; i< original.length; i++){
            shallow [i] = original[i];
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }
        shallow[0] = 99;
        System.out.println();
        for(int i=0; i< original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }
        System.out.println();

        // 3. 깊은 복사 (System.arraycopy() 이용) 디테일한 배열 복사를 이용할경우
        System.out.println("---깊은 복사 + System.arraycopy() 이용---");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = new int[original.length];

        // 원본 배열, 0번 인덱스부터, shallow 배열에, 0번 인덱스부터, origianl 길이 만큼 복사해줘
        System.arraycopy(original, 0, shallow, 0, original.length);

        shallow[0] = 99;

        for(int i=0; i< original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }
        System.out.println();


        // 4. 깊은 복사 arrayys.copyof() 이용)
        System.out.println("---깊은 복사 + arrayys.copyof() 이용---");
        original = new int[]{10, 20, 30, 40, 50};
        shallow = Arrays.copyOf(original, original.length);
        shallow[0] = 99;
        for(int i=0; i< original.length; i++){
            System.out.println("original: " + original[i] + ", shallow: " + shallow[i]);
        }
        System.out.println();

    }
}
