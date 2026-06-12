package team.RPG;

import java.util.Scanner;

public class Play {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        final String Name = s.nextLine();
        System.out.println("이름을 입력해주세요");
        System.out.println("플레이어블의 이름은 " + Name + "입니다. \n용사님의 건투를 빕니다.");

        Player ply = new PlayerStatus(Name);
        ply.getStatus();

        System.out.println("숫자를 입력하여 직업을 선택해 주세요");
        System.out.println("1. 전사 \n2. 궁수 \n3. 마법사");
        int num = s.nextInt();
        ply.selectJob(num);
        ply.viewStatus();
    }
}
