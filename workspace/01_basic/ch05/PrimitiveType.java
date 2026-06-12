package ch05;

public class PrimitiveType {
    void main() { //자바 프로그램 시작
        int age; // 변수 선언
        age = 25;// 값을 변수에 할당
        System.out.println(age);// 나이 출력 + Enter
        age = 30;// 재할당
        System.out.println(age); // 나이 출력

        int score = 100; // 변수 선언과 동시에 값 할당
        System.out.println(score);

        int b = 128; //byte 범위를 벗어남
        System.out.println(b);

        short s = 10000;
        System.out.println(s);

        int num = 1000000000;
        System.out.println(num);

        long Bignum = 1000000000000L; // long타입인 경우 뒤에 L
        System.out.println(Bignum);

        double Pi = 3.141592;
        System.out.println(Pi);

        float ShortPi = 3.14F;// float은 숫자 뒤에 F가 반드시 붙어야한다.
        System.out.println(ShortPi);

        boolean isGood = true;
        System.out.println(isGood);

        boolean isBad = false;
        System.out.println(isBad);

        char grade = 'A';
        System.out.println(grade);

        grade = 'B'; //grade에 B를 재할당
        System.out.println(grade);

        String firstname = "니노막시";
        String lastname = "카이져소제";
        System.out.println(firstname);
        System.out.println(lastname);

        // 상수 만들기(변하지 않는 변수)
        final double PI = 3.1415926535;

        System.out.println(PI*5*5);
        //final int MAX_SIZE = 100; // 상수 선언 (주로 대문자와 언더스코어 사용)
        // MAX_SIZE = 200; // 에러 발생! 상수는 변경 불rk
   }
}
