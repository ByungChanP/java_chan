package ch12.car;

import java.util.Arrays;
import java.util.Objects;

public class Bus extends Car{
    private int passengerCount; // 승객 수
    private String no; // 버스 번호
    private String type; // 광역버스, 마을버스 ...
    private String[] stations; // 노선
    private int station; // 현재 위치
    private int price; // 승차비
    private int maxPassenger; // 최대 승객수
    private int money; // 현재까지의 수익
    private int totalPassenger; // 총 승차 인원
    private static int totalMoney; // 운영하는 모든 버스의 수익
    // 컴파일러에 의해서 자동으로 생성되는 기본 생성자 모습
//    Bus(){ super(); }

    public Bus(String model, String no, String type
            , String[] stations, int price, int maxPassenger) {
        super(model);
        this.no = no;
        this.type = type;
        this.stations = stations;
        this.price = price;
        this.maxPassenger = maxPassenger;

    }

    // count 만큼 승차합니다.
    void ride(){
        // 수익 증가
        // 어린이 / 청소년 / 성인 / 노인별 할인율 적용해서 할인
        // 교통카드 / 현금 / 기타 할인 (지역 주민 할인, 특정 카드 이용시 할인)
        if(passengerCount < maxPassenger) {
            passengerCount++; //현재 승차인원
            money += price; // 버스 1대의 수익
            totalPassenger++; // 누적 승차 인원
            totalMoney += price; // 모든 버스의 전체 수익
            System.out.println("1명이 승차합니다.");
        }else{
            System.out.println("승차 인원이 초과되었습니다. 다음 버스를 타세요.");
        }
    }
    void ride(int count){
        for(int i=0; i<count; i++){
            ride();
        }
    }

    // 하차합니다.
    void leave(){
        passengerCount--;
        System.out.println("1명이 하차합니다.");
    }

    void leave(int count) {
        for (int i = 0; i < count; i++) {
            leave();
        }
    }

        // 오버라이딩: 부모 메서드를 자식이 재정의
    void stop(){

        super.stop(); // 부모의 stop() 메서드 호출
        station++;
        if (station == stations.length) {
            station = 0;
            }
            System.out.println("이번역은 " + stations[station] + "역 입니다.");
         }

        // 기다리는 버스가 몇 정거장 전에 있는가?
//    int getStationsLeft(){
//        int result = 0;
//        return result;
//        }

    @Override
    public boolean equals(Object o) { //Bus -> object 자동 형변환
        if (o == null || getClass() != o.getClass()) return false;
        Bus bus = (Bus) o; //명시적 형변환
        return Objects.equals(no, bus.no);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(no);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerCount=" + passengerCount +
                ", no='" + no + '\'' +
                ", type='" + type + '\'' +
                ", stations=" + Arrays.toString(stations) +
                ", station=" + station +
                ", price=" + price +
                ", maxPassenger=" + maxPassenger +
                ", money=" + money +
                ", totalPassenger=" + totalPassenger +
                '}';
    }
}
