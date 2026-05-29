package ch08;

// 첫달에 월급 1원을 받고 매달 두배씩 받을때
// 몇달이 지나야 월급 1억을 넘기는가?
public class WhileTest2 {
    public static void main(String[] args){

        int month = 1;
        int sal = 1;

        while (sal < 100000000) {
            month++;
            sal *= 2;
            System.out.println(month + "달의 급여는 " + sal + "이 될것이다.");
        }
    }
}
