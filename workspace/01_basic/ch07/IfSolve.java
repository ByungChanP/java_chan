package ch07;

// [문제] 시험 점수(score)에 따른 학점을 출력하는 코드를 작성하세요.
// 학점 기준:
// - 90점 이상 ~ 100점 이하: A
// - 80점 이상 ~ 89점 이하: B
// - 70점 이상 ~ 79점 이하: C
// - 60점 이상 ~ 69점 이하: D
// - 0점 이상 ~ 59점 이하: F
// - 그 외의 점수 (음수이거나 100점을 초과하는 경우): "올바르지 않은 점수입니다."" 출력
public class IfSolve {
    public static void main(String[] args) {
        int score = 99;

        if (score > 100 || score < 0 ) {
            System.out.println("올바르지 않는 점수입니다.");

        } else if (score <= 59) {
            System.out.println("F");

        } else if (score <= 69) {
            System.out.println("D");

        } else if (score <= 79) {
            System.out.println("C");

        } else if (score <= 89) {
            System.out.println("B");

        } else {
            System.out.println("A");

        }
    }
}