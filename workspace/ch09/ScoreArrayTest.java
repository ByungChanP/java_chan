package ch09;//국어, 영어, 수학 점수를 이용하여 총점과 평균을 계산

public class ScoreArrayTest {
    public static void main(String[] args){

//        int kor = 100; // 국어 점수
//        int eng = 90;  // 영어 점수
//        int math = 85; // 수학 점수

//        1. 선언, 생성, 초기화를 각각
//        int[] parkScore;
//        parkScore = new int[3]; // 배열 생성(갯수 지정) 12byte 메모리(힙) 할당
//        parkScore[0] = 100; //배열 요소 초기화(index를 사용)
//        parkScore[1] = 90;
//        parkScore[2] = 85;

//        2. 배열 선언과 생선을 동시에
//        int[] parkScore = new int[3];
//        parkScore[0] = 100; //배열 요소 초기화(index를 사용)
//        parkScore[1] = 90;
//        parkScore[2] = 85;

//      3. 배열 선언, 생성, 초기화를 동시에
//        int[] parkScore = new int[]{100, 90, 85};
        int[] parkScore = {100, 90, 85}; // 이게 가장 간단하네



        System.out.println("국어 : " +  parkScore[0]); // 100
        System.out.println("영어 : " +  parkScore[1]); // 100
        System.out.println("수학 : " +  parkScore[2]); // 100

        int sum = parkScore[0] + parkScore[1] + parkScore[2]; // 총점
        System.out.println("총점 : " + sum);

        double avg = sum / 3.0;
        avg = Math.round(sum / 3.0); // 평균 소수점에서 반올림
        System.out.println("평균 : " + avg); // 92 첫째자리에서 반올림

        avg = sum / 3.0;
        avg = Math.round(avg * 10) / 10.0 ;
        System.out.println("평균 : " + avg); //91.7 둘째자리에서 반올림

        avg = sum / 3.0;
        avg = Math.round(avg * 100) / 100.0 ;
        System.out.println("평균 : " + avg); //91.67 둘째자리에서 반올림ScoreTest
    }
}
