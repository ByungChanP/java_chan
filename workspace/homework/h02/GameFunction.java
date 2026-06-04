package homework.h02;

import java.util.Scanner;

public class GameFunction {

    static int[] fight(int hp, int enemyHp){

        System.out.println("적과 싸웁니다");
        int enemyDamage = (int)(Math.random() * 11);
        enemyHp -= enemyDamage;
        int damage = (int)(Math.random() * 11);
        hp -= damage; // main method에 값을 전달해야 한다.
        System.out.println("적에게 " + enemyDamage + " 만큼의 데미지를 주고"  + damage + "의 데미지를 입었다.");
        System.out.println("나의 남은 체력은 " + hp + "입니다");
        System.out.println("적의 남은 체력은 " + enemyHp + "입니다.");
        System.out.println();

        return new int[]{hp, enemyHp}; //return은 하나의 값밖에 반환을 못함
    }
    static int[] fightBoss(int hp, int bossEnemyHp){

        System.out.println("보스와 싸웁니다!!!");
        int bossEnemyDamage = (int)(Math.random() * 11 * 0.9);
        bossEnemyHp -= bossEnemyDamage;
        int damage = (int)(Math.random() * 11);
        hp -= damage;
        System.out.println("적에게 " + bossEnemyDamage + " 만큼의 데미지를 주고"  + damage + "의 데미지를 입었다.");
        System.out.println("나의 남은 체력은 " + hp + "입니다");
        System.out.println("적의 남은 체력은 " + bossEnemyHp + "입니다.");
        System.out.println();

        return new int[]{hp, bossEnemyHp};
    }

    static  int[] runAway(int hp) {
        int damage = (int)(Math.random() * 10 + 1 );
        hp -= damage;
        int enemyHp = (int)(Math.random() * 100 + 20); // 10 ~ 119 도망친경우 새로운 몹

        System.out.println("도망간다. 대신 " + damage + "의 체력이 소비되었다.");
        System.out.println("남은 체력은 " + hp + "입니다.");
        System.out.println();

        return new int[]{hp, enemyHp} ;

    }

    static int heal(int hp){
        hp += 10;
        System.out.println("체력이 10만큼 회복되었습니다.");
        System.out.println("남은 체력은 " + hp + "입니다.");
        System.out.println();
        return hp;
    }

    static int useUltimateSkill(int enemyHp) {

        int chance = (int) (Math.random() * 2);
        int enemyDamage = enemyHp * chance;

        enemyHp -= enemyDamage;

        System.out.println(" 내 궁극의 일격을 받아라!!!");
        if (enemyHp == 0) {
            System.out.println("적을 쓰러뜨렸습니다.");
        }
        return enemyHp;
    }

    static void finish(){

        Scanner s = new Scanner(System.in);
        System.out.println("정말로 종료하시겠습니까?");
        System.out.println("1) 종료한다. 2) 계속한다");

        int confirm = s.nextInt();
        switch (confirm){
            case 1 -> {
                System.out.println("게임을 종료합니다. 나중에 또 만나요^^");
                System.exit(0);
            }
            case 2 -> {
                break;
            }
        }
    }





    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        System.out.println("***전투력 키우기***");
        System.out.println("캐릭터 이름을 지어주세요!!!");
        String name = s.next();

        // 지역변수는 전부 스택영역에 저장된다.

        int hp = 100; //체력
        int damage = 0;   // 받은 피해량
        int enemyHp = (int)(Math.random() * 100 + 20); // 10 ~ 119인  적군 체력
        int bossEnemyHp = 2*enemyHp;// 보스체력
        int enemyDamage = 0; // 적군 받은 피해량
        int bossEnemyDamage = 0; // 보스가 받는 피해량
        int ultimateskill = 1; // 필살기 횟수

        System.out.println(name + "님 어서오세요. 게임을 시작합니다.");

        if(enemyHp > 100){
            bossEnemyHp = enemyHp * 2; // 5% 확률로 2배의 체력이 되는 보스몹을 소환
        }
        while(true){

            if(enemyHp <=100){
                System.out.println(enemyHp + " 체력을 가진 적을 만났다. 어떤 행동을 하겠습니까?");
            }else{
                System.out.println(bossEnemyHp + " 체력을 가진 야생의 보스가 나타났다!!! 어떤 행동을 하겠습니까?");
            }
            System.out.println(" 1) 싸운다 2) 도망간다 3) 아이템을 사용한다 4) 필살기 사용 5) 종료하기)" );
            int action = s.nextInt();

            switch(action){
                case 1 -> {
                    if (enemyHp <= 100){
                        int[] result = fight(hp, enemyHp);
                        hp = result[0];
                        enemyHp = result[1];
                    }else{
                        int[] result = fightBoss(hp, bossEnemyHp);
                        hp = result[0];
                        bossEnemyHp = result[1];
                    }

                }
                case 2 -> {
                    int[] result = runAway(hp);
                    hp = result[0];
                    enemyHp = result[1];
                    if(enemyHp > 100){
                        bossEnemyHp = enemyHp * 2; // 확률로 2배의 체력이 되는 보스몹을 소환
                    }
                }
                case 3 -> {

                    hp = heal(hp);

                }
                case 4 -> {

                    if(ultimateskill > 0){

                        enemyHp = useUltimateSkill(enemyHp);
                        ultimateskill--;

                    }else{
                        System.out.println("사용 할 수 있는 필살기가 없습니다.");
                        System.out.println();
                    }
                }
                case 5 -> { // 강제 종료
                    finish();
                }
            }

            if(hp <= 0 || enemyHp <= 0 || bossEnemyHp <= 0 ){
                break;
            }
        }
        if(hp <=0){
            System.out.println("당신은 사망했습니다.");
        }else if (enemyHp <= 0 || bossEnemyHp <= 0){
            System.out.println("전투에서 승리하였습니다.");
        }
    }
}
