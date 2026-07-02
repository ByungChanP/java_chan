package level01.day03;



public class Prob04 {

    void main(){
    int a =55;
    int b = 11;

    System.out.println(merge(a,b));
    }
    int merge(int a, int b){
        int num1 = a; //11 digits: 100
        int num2 = b; //9  digits: 10
        // 110+9 , 900+11 을 비교
        int merge_a = (a * digits(b)) + b;
        int merge_b = (b * digits(a)) + a;

        // 합쳐진 숫자 비교하여 출력
        if(merge_a > merge_b) {
            return merge_a;
        }else if( merge_b > merge_a){
            return merge_b;
        }else {
            return merge_a;
        }
    }
    // 자릿수 계산
    int digits(int num){
        int number = num;
        int digits = 0;
            // 자릿수

        if (number / 10 < 1) {
            digits = 10; //한 자리수이기 때문에 곱해서 더해야함
        }else if (number / 100 < 1) {
            digits = 100;
        } else if (number / 1000 < 1) {
            digits = 1000;
        } else if (number / 10000 < 4) {
            digits = 10000;
        }
        System.out.println(digits);
        return digits;
        }
    }

