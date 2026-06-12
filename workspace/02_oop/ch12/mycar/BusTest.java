package ch12.mycar;

import java.util.Scanner;

// 탑승 인원을 입력하여 반복수행
public class BusTest {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("탑승인원을 적어주세요");
        int rideNumbers = s.nextInt();
        s.nextLine();
        System.out.println("----나이를 입력하세요----");
        int passengerAge = s.nextInt();
        s.nextLine();

        System.out.println("결제 방법");
        System.out.println("a) 현금, b) 교통카드 c) 지역카드");
        String method = s.nextLine();


        Bus mycar = new Bus("빠스", "10-2", "순환 버스", new String[]{"우리집", "김포 공항", "인천 공항"}, 1300,1300 ,0 ,9, passengerAge, method);
        mycar.Price(passengerAge, method); // 할인율을 적용한 탑승 승객의 가격
        mycar.ride(); // 인원만큼 탑승
        System.out.println(mycar.getBusInfo());
        mycar.sumPrice();

        // 반복하여 버스 정보 갱신
        for (int i = 1; i < rideNumbers; i++) {

            System.out.println("----나이를 입력하세요----");
            passengerAge = s.nextInt();
            s.nextLine();

            System.out.println("결제 방법");
            System.out.println("a) 현금, b) 교통카드 c) 지역카드");
            method = s.nextLine();

            mycar.Price(passengerAge, method); //탑승 승객의 가격
            mycar.ride();
            System.out.println(mycar.getBusInfo());
            mycar.sumPrice();
        }
        System.out.println("내릴 인원을 체크해주세요");
        int leaveNumbers = s.nextInt();
        for (int i = 0; i < leaveNumbers; i++) {
            mycar.leave();
        }
        System.out.println(mycar.getBusInfo());
    }
}