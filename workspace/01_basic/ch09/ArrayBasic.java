package ch09;

public class ArrayBasic {
    public static void main(String[] args) {
        // scores int 배열을 선언하고, 생성 (크기는 3)
//        int[] scores;
//        scores = new int[3];
//        // names String 배열을 선언하고 생성하시오 (크기는 3)
//        String[] names;
//        names = new String[3];
//        // scores 배열의 각 요소에 값을 할당
//        scores = new int[]{5, 7, 9};
//        // names 배열의 각 요소에 값을 할당
//        names = new String[]{"안녕", "친구야", "자러간다"};
//        // scores 배열의 두 번째 요소값을 출력
//        System.out.println(scores[1]);
//        // names 배열의 모든 요소값을 출력
//        System.out.println(names[1]);

        int[] scores = {3, 4, 7, 9, 10};
        String[] names = {"안", "녕", "하", "세", "요"};
        for(int i = 0; i < scores.length; i++){
            System.out.print(scores[i] + " ");
        }
        System.out.println();
        for(int i = 0; i < names.length; i++){
            System.out.print(names[i]);
        }
    }
}
