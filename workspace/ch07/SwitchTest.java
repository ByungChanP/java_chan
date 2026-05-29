package ch07;

public class SwitchTest {
    public static void main(String[] args) {
        int month = 4;

        if(month < 1 || month > 12) {
            System.out.println("1~12 사이의 숫자를 입력해야 합니다. ");
            System.exit(0);
        }
        //v1
        switch (month) { // case 시작부터 끝까지 실행된다. break문이 필요하다.
            case 1:
                System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");
                break;
            case 2:
                System.out.println(month + "월의 마지막 날짜는 28일 입니다. ");
                break;
            case 3:
                System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");
                break;
            case 4:
                System.out.println(month + "월의 마지막 날짜는 30일 입니다. ");
                break;
            case 5:
                System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");
                break;
            case 6:
                System.out.println(month + "월의 마지막 날짜는 30일 입니다. ");
                break;
            case 7:
                System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");
                break;
            case 8:
                System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");
                break;
            case 9:
                System.out.println(month + "월의 마지막 날짜는 30일 입니다. ");
                break;
            case 10:
                System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");
                break;
            case 11:
                System.out.println(month + "월의 마지막 날짜는 30일 입니다. ");
                break;
            case 12:
                System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");
        }//switch 닫기


        //v2
        switch (month)  {
            case (2):
                System.out.println(month + "월의 마지막 날짜는 28일 입니다. ");
                break;

            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println(month + "월의 마지막 날짜는 30일 입니다. ");
                break;
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");
                break;
        }

        //v03
        switch (month)  {
            case (2):
                System.out.println(month + "월의 마지막 날짜는 28일 입니다. ");
                break;

            case (4):
            case (6):
            case (9):
            case (11):
                System.out.println(month + "월의 마지막 날짜는 30일 입니다. ");
                break;
            default:
                System.out.println(month + "월의 마지막 날짜는 31일 입니다. ");
                break;
        }

        //04 대박!!!
        int lastday = 0;
        switch (month)  {
            case (2):
                lastday = 28;
                break;

            case (4):
            case (6):
            case (9):
            case (11):
                lastday = 30;
                break;
            default:
                lastday = 31;
                break;
        }
        System.out.println(month + "월의 마지막 날짜는 " + lastday + "일 입니다. ");
        System.out.println("프로그램 종료");

    } // main 닫기
}//class 닫기
