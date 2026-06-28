package level02.day02;

public class Prob03 {
    void main(){
        int[] number = solution(9,2,1,3);
        for(int i=0; i< number.length; i++){
            System.out.println(number[i]);
        }
    }
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int num1 = molecule(numer1, denom1, numer2, denom2);
        int num2 = denominator(numer1, denom1, numer2, denom2);
        for(int i=1000; i>0; i--){
            if(num1 % i ==0 && num2 % i ==0){
                num1 = num1/i;
                num2 = num2/i;
            }
        }
        int[] answer = {num1 ,num2} ;
        return answer;
    }
    int denominator(int numer1, int denom1, int numer2, int denom2) {
        if (denom1 == denom2) {
            return denom1;
        } else {
            return denom1 * denom2;
        }
    }
    int molecule(int numer1, int denom1, int numer2, int denom2){
        if (denom1 == denom2) {
            return numer1 + numer2;
        } else {
            return (numer1 * denom2) + (numer2 * denom1);
        }
    }
}
