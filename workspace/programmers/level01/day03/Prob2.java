package level01.day03;

public class Prob2 {
    void main(){
    String[] answer_arr = {"a","b","c"};
        System.out.println(arr(answer_arr));
    }
    String arr(String[] arr){
        String[] arr1 = arr;
        String answer = "";
        for(int i=0; i<arr.length; i++){
            String Char = arr1[i];
            answer += Char;
        }
        return answer;
    }
}
