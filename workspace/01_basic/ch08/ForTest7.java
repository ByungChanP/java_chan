package ch08;

public class ForTest7 {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 0; i <= 100 ; i++ ) {
            if(i % 2 == 0 ) { //짝수일 때 건너띄기
                continue;
            }
            sum += i;
        }
        System.out.println(sum);

        // 1~100 합계
        int num = 1;
        sum = 0;
        while(true){
            sum += num;
            num++;
            if(num > 100){
                break;
            }
        }
        System.out.println(sum);
    }
}
