package ch07;


// 입력받은 월(month)의 마지막 날짜를 출력하세요. (윤달 계산하지 마시오)
public class IfTest2 {
    public static void main(String[] args){
        int month = 8;

        if ( month < 1 || month > 12) {
            System.out.println( "그런 " + month + "월은 없습니다 휴먼!!");
            System.exit(0); //프로그램 강제 종료 코드

        } else if ( month == 2 ) {
            System.out.println(month + "월의 마지막 날짜는 28일 입니다.");

        } else if ( month % 2 != 0 || month == 8) {
            System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");

        } else {
            System.out.println(month + "월의 마지막 날짜는 30일 입니다.");
        }
    }
}
