package level01.day02;

public class Prob05 {

    void main(String[] args) {
        System.out.println(solution("program29b8uyp","mers123", 7));
    }

    public String solution(String my_string, String overwrite_string, int s) {
        String a = my_string.substring(0, s);
        String b = overwrite_string;
        if (my_string.length() > (a.length() + b.length())) {
            String c = my_string.substring(a.length() + b.length());
            String answer = a + b + c;
            return answer;
        } else {
            String answer = a + b;
            return answer;
        }
    }
}
