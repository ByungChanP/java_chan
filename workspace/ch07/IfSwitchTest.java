package ch07;

// 나이에 따른 입장료 할인 계산하는 프로그램을 작성하시오.
// 나이가 7세 이하: 영유아 할인 100%
// 나이가 8 ~ 13: 초등학생 할인 50%
// 나이가 14 ~19: 청소년 할인 30%
// 경로 65세 이상 70% 할인
public class IfSwitchTest {
    public static void main(String[] args) {

        int age = 16;
        int price = 20000;
        double discountRate = 0.0; // 할인율
        int lastPrice = price;

        if (age <= 7) {
            discountRate = 1.0;


        } else if (age <= 13) {
            discountRate = 0.5;


        } else if (age <= 19) {
            discountRate = 0.3;


        } else if (age >= 65) {
            discountRate = 0.7;

        } else {
            discountRate = 0.0;
        }

        lastPrice = (int) (price * (1 - discountRate)) ;
        System.out.println("나이가 " + age + "세 이므로 " + discountRate * 100 + "%가 적용되어 요금은 " + lastPrice + "원입니다.");
    }
}
