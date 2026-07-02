package level02.day03;

public class Prob04 {
    void main(){
        int n = 10;
        for(int i=0; i<count(n); i++){
            System.out.println(odd(n)[i]);
        }
    }
    int[] odd(int n){
        int num = count(n);
        // 홀수 갯수만큼의 길이의 배열 생성
        int[] arr = new int[num];
        for(int i=0; i<num; i++){
            arr[i] = 2*i + 1;
        }
        return arr;
    }
    // 홀수 갯수
    int count(int n){
        int num;
        if(n%2 ==0){
            num = n/2;
        }else{
            num = n/2 +1;
        }
        return num;
    }
}
