package team;

import java.util.Scanner;

public class PetGame {
    ///전역 변수 지정
    public static int Intimacy = 0;
    void main(String[] args){
        Scanner s = new Scanner(System.in); /// 이거 자주 사용하겠다.
        System.out.println("### 펫 먹이주기 게임 ###");
        while(true) {
            if (Intimacy >= 100){
                System.out.println("축하합니다 펫이 당신을 따릅니다.");
                break;
            }
            System.out.println("### 숫자를 입력해주세요 ###");
            int num = s.nextInt();
            if (num < 1 || num > 3)
            {
                System.out.println("1~3까지 입력해주세요");
                continue;
            }

            switch (num){
                case 1 -> {
                    feed("meat");

                }
                case 2 -> {
                    int count = (int)(Math.random() * 6);
                    feed("meat", count );

                }
                case 3 -> {
                    feed();
                }
            }
            System.out.println(Intimacy);
        }
    }
    void feed(String meat){
        System.out.println(meat + "를 맛있게 먹었습니다.");
        Intimacy += 10;
    }
    void feed(String meat, int cnt){
        System.out.println(meat + "를 " + cnt + "개 를 맛있게 먹었습니다.");
        Intimacy += (cnt * 5);
    }
    void feed() {
        System.out.println("시원한 물을 마시고 기분이 좋아졌습니다.");
        Intimacy += 2;
    }
}