package ch09;

public class EnhancedFor {
    public static void main(String[] args){
//        int[] scores = {90, 90, 75}; // 3과목
        int[] scores = {100, 80, 70, 88}; // 4과목

        int sum = 0; //총점
        double avg = 0;//평균

        // 과목 수와 상관없이 총점과 평균을 계산하시오
//        for(int i=0; i<scores.length; i++){
//            sum += scores[i];
//        }

        // Enhanced for loop 배열의 모든 요소를 꺼내서 시도해야 할 때 사용....
        for(int score : scores){ // int score = scores[i]
            sum += score;

        }

        avg = (double)sum / scores.length;
        System.out.println("총점: " + sum);
        System.out.println("평균: " + avg);
    }
}
