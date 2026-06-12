package ch08;

public class DoWhileTest {
    public static void main(String[] args){
        int num;

        do{
            num = (int)( Math.random() * 6 ) + 1; // 0 이상 ~1미만의 double 타입의 숫자를 반환해준다. // int(0~5.9999) + 1
            System.out.println(num);
        } while(num != 6) ;
    }
}
