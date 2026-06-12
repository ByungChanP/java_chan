package ch11.capsule.ex03;

public class AccountTest {
    public static void main(String[] args){

        Account myAccount = new Account();
        // 만원이 입금되었습니다. 잔고는 10000원 입니다.
        myAccount.deposit(10000);
        // 오천원이 출금되었습니다. 잔고는 5000원 입니다.
        myAccount.withdraw(5000);
//        myAccount.balance = 3000;
        // 잔고가 부족합니다. 잔고는 5000원 입니다.
        myAccount.withdraw(7000);

        System.out.println("현재 잔고: " + myAccount.getBalance());
    }
}
