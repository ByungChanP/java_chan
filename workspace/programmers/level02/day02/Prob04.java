package level02.day02;

public class Prob04 {
    void main(){
        int[] answer = {1,2,3,4,5};
        answer = solution(answer);
        for(int i=0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
    public int[] solution(int[] numbers) {
        for(int i=0; i< numbers.length; i++){
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}
