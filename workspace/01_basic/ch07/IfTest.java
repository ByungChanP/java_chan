package ch07;

// 입력한 숫자가 3의 배수일 경우 "3의 배수입니다." 를 출력
// 아닌경우 아무것도 "3의 배수가 아닙니다"를  출력 하고, 홀수 인지 짝수인지 여부를 출력.
public class IfTest {
    public static  void main(String[] args) {
        int num = 17;

//        if (num % 3 == 0){
//            System.out.println(num + ": 3의 배수입니다.");
//        }
//        if (num % 3 != 0){
//            System.out.println(num + ": 3의 배수가 아닙니다.");
//        }

        if (num % 3 == 0) {
            System.out.println(num + ": 3의 배수입니다.");
        } else if ( num % 2 == 0) {
            System.out.println((num + " 짝수 입니다. "));
        } else {
                System.out.println(num + ": 홀수 입니다.");
        }


    }
}
