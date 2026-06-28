package level01.day01;

import java.util.Scanner;

public class Prob04 {
    void main(){

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String answer =" ";
        for(int i=0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                answer += Character.toLowerCase(c);
            } else {
                answer += Character.toUpperCase(c);
            }
        }
        System.out.println(answer);
    }
}
