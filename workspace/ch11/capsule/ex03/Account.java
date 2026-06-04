package ch11.capsule.ex03;

public class Account {
    //잔고
    private int balance;

    public int getBalance() {
        return balance;
    }

    //입금
    public void deposit(int amount){
        if(amount > 0){
            this.balance = balance;
            balance += amount;
            System.out.println("당신의 잔고는 " + balance + "원 입니다.");
        }
    }
    //출금
    public void withdraw(int amount) {
        if (balance >= amount) {
            this.balance = balance;
            balance -= amount;
            System.out.println("당신의 잔고는 " + balance + "원 입니다.");
        } else {
            System.out.println("잔고가 부족합니다. 당신의 잔고는 " + balance + "원 입니다.");

        }
    }
}
