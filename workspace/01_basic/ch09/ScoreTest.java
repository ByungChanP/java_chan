package ch09;//국어, 영어, 수학 점수를 이용하여 총점과 평균을 계산

public class ScoreTest {
    public static void main(String[] args){
        int kor = 100; // 국어 점수
        int eng = 90;  // 영어 점수
        int math = 85; // 수학 점수

        int sum = kor + eng + math; // 총점
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
