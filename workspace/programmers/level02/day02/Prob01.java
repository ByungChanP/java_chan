package level02.day02;

public class Prob01 {
    void main(){
        System.out.println(solution(3,2));
    }
    public int solution(int num1, int num2) {
        int answer = (int)((double)(num1)*1000 / num2);
        return answer;
    }
}
