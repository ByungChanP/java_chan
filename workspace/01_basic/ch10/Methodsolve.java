package ch10;

public class Methodsolve {

    // int[] 점수를 전달받아서 총점을 계산해서 반환하는 메서드
    // int 총점을 전달받아서 평균을 계산하여 반환하는 메서드 (평균은 소수도 표현)
    // int[] 총점과 평균을 전달받아서 출력하는 메서드

    void main(String[]args){
        // haru는 국어, 영어, 수학 점수가 각각 80, 70, 56이다.
        // namu는 국어, 영어, 수학 점수가 각각 90, 79, 80이다.
        // brong이는 국어, 영어, 수학 점수가 각각 100, 99, 88이다.
        // 이 셋의 총점과 평균을 구해서 출력하시오

        int[] haruScore = {80, 70, 56};
        int[] namuScore = {90, 79, 80};
        int[] brongScore = {100, 99, 88};
        printScore(haruScore);
        printScore(namuScore);
        printScore(brongScore);
    }
    int sum(int[] scores){

        int total = 0;
        for(int score : scores){
            total += score;
        }
        return total;
    }

    double avg(int[] scores) {

        int total = sum(scores);
        double scoreAvg = (double) total / scores.length;
        return Math.round(scoreAvg * 10) / 10.0;

    }
    void printScore(int[] scores){
        int total  = sum (scores);
        double scoreAvg = avg (scores);
        System.out.println("최종 출력 결과");
        System.out.println("총점: " + total + " 평균: " + scoreAvg);
    }
}
