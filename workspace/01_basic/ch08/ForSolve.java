package ch08;


// 1부터 100까지의 합계를 구한다.
// 1부터 100까지의 홀수의 합계를 구한다.
// 1부터 100까지의 짝수의 합계를 구한다.
public class ForSolve {
    public static void main(String[] args) {

        int sum1 = 0;
        for(int i = 0; i <= 100; i++  ) {
            sum1 += i;
        }
        System.out.println(sum1);

        int sum2 = 0;
        for(int j = 0; j <= 100 ; j++ ) {
            if(j % 2 != 0 ) {
                sum2 += j;
            }
        }
        System.out.println(sum2);

        int sum3 = 0;
        for(int k = 0; k <= 100; k++  ) {
            if(k % 2 == 0 ) {
                sum3 += k;
            }
        }
        System.out.println(sum3);
    }
}
//짝수
//int sum1 = 0;
//for(int i = 0; i <= 100; i +=2  ){
//    sum1 +=i;
//}
//홀수
//int sum1 = 0;
//for(int i = 1; i <= 100; i +=2  ){
//    sum1 +=i;
//}
