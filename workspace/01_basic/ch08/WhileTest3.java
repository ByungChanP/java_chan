package ch08;

// 6이 나올때까지 주사위를 던지자

public class WhileTest3 {
    public static void main(String[] args){
        int testCount = 0;
        while(testCount < 100) {

            int num = 0;
            int count = 0;
            while(num != 600)
            {
                // 주사위 던지기
                num = (int)( Math.random() * 600 ) + 1; // 0 이상 ~1미만의 double 타입의 숫자를 반환해준다. // int(0~5.9999) + 1
                System.out.println(num);
                count++;
            }
            System.out.println("반복횟수: " + count );
            testCount++;
        }
    }
}