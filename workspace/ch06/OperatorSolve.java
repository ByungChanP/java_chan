package ch06;

public class OperatorSolve {
    public static void main(String[] args){
        System.out.println("=== [실습 1] 정수와 실수의 산술 연산 ===");
        int a = 27;
        int b = 4;
        double divResult = a/(double)b; // 이 부분을 수정하세요.
        System.out.println("10 / 3 결과 (실수): " + divResult); // 3.3333333333333335

        int modResult = a%b; // 이 부분을 수정하세요.
        System.out.println("10을 3으로 나눈 나머지: " + modResult);

        System.out.println("\n=== [실습 2] 삼항 연산자와 비교 연산자 ===");
        int number = 16;

        String evenOrOdd = (number % 2 == 0)? "짝수" : "홀수"; // 이 부분을 수정하세요.
        System.out.println(number  + " 은/는 " + evenOrOdd + "입니다."); // 15은/는 홀수입니다.


        System.out.println("\n=== [실습 3] 논리 연산자를 활용한 윤년 판별 ===");
        int year = 2100;

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 ==0); // 이 부분을 수정하세요.
        System.out.println(year + "년은 윤년인가요? " + isLeapYear); // 2024년은 윤년인가요? true

    }
}
