package ch11.capsule.ex02;


public class ScoreTest {

    public static void main(String[] args) {
        Score haru = new Score(100, 90, 85);
        // 필드의 직접 접근은 제한됨
//        haru.kor = 1000000;

//        int haruSum = haru.sum();
        double haruAvg = haru.avg();
//        System.out.println("총점: " + haruSum);
        System.out.println("평균: " + haruAvg );

        haru.setMath(haru.getMath() + 15);
        haruAvg = haru.avg();
        System.out.println("수정 평균: " + haruAvg);
    }
}
