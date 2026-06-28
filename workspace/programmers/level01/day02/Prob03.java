package level01.day02;


import java.util.Scanner;

public class Prob03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        if(a.length() >=1 && a.length() <= 10){
            for (int i = 0; i < a.length(); i++) {
                System.out.println(a.substring(i,i+1));
            }
        }
    }
}
