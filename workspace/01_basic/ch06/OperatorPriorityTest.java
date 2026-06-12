package ch06;

public class OperatorPriorityTest {
    public static void main(String[] args){
        // 1. 산술 연산자 우선 순위: 곱셈이 덧셈보다 우선함
        int result1 = 5 + 3 * 2;
        System.out.println("result1 (5 + 3 * 2) = " + result1);
        // 괄호를 사용하면 우선순위를 1순위
        int result2 = (5 + 3) * 2;
        System.out.println("result2 ((5 + 3) * 2) = " + result2);

        // 2. 비교 연산자의 우선 순위: 비교 연산이 논리 연산보다 운선
        boolean result3 = 10 > 5 && 3 < 1; // true && false
        System.out.println("result3 (10 > 5 && 3 < 1); = " + result3);// false


    }
}
