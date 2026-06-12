package ch11.capsule.ex03;

public class AccountBad {
    //잔고
    public int belance;


    //입금
    public void deposit(int amount){
        if(amount > 0){
            this.belance = belance;
            belance += amount;
            System.out.println("당신의 잔고는 " + belance + "원 입니다.");
        }
    }
    //출금
    public void withdraw(int amount) {
        if (belance >= amount) {
            this.belance = belance;
            belance -= amount;
            System.out.println("당신의 잔고는 " + belance + "원 입니다.");
        } else {
            System.out.println("잔고가 부족합니다. 당신의 잔고는 " + belance + "원 입니다.");

        }
    }
}
