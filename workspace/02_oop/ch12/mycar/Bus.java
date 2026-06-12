package ch12.mycar;

// 자동으로 생성되는 기본생성자는 상속이 불가능
public class Bus extends Car {

    private int passingerCount; //승객의 수
    private String num; // 버스의 번호
    private String type; // 마을버스 고속버스
    private String[] stations; // 노선
    private int station ; // 현재 위치
    private int price; // 승차 비용
    private int finalPrice;//
    private int maxPassenger; // 최대 탑승 인원
    private int totalPassenger; // 총 승차 인원
    private int totalMoney; //운영하는 모든 버스의 수익
    private int passengerAge; // 승객 나이에 따른 할인율
    private String method; // 결재방안
    // 부모 클래스가 기본생성자가 아니기 때문에 자동으로 기본생성자가 생성되어 에러발생

    public Bus(String model, String num, String type, String[] stations, int price,int finalPrice,int totalMoney, int maxPassenger, int passengerAge, String method) {
        super(model);
        this.num = num;
        this.type = type;
        this.stations = stations;
        this.price = price;
        this.finalPrice = finalPrice;
        this.totalMoney = totalMoney;
        this.maxPassenger = maxPassenger;
        this.passengerAge = passengerAge;
        this.method = method;
    }


    //승차합니다.
     void ride(){
        //수익 증가
        //어린이 / 청소년 / 성인 / 노인별 활인율 적용
        // 교통카드/ 현금 / 기타 할인 (지역 주민 할인, 특정 카드 이용시 할인)
        if(passingerCount < maxPassenger){
            passingerCount++;
            totalPassenger++;

            System.out.println("1명 승차");
            System.out.println("탑승 번호: " + totalPassenger);


        } else {
            System.out.println("인원 초과. 다음 버스 이용");
        }
    }
    // 기다리는 버스가 몇 정가장 전에 위치하는가?
    int getStationsLeft(){
        int result = 0;


        return  result;
    }


    String getBusInfo(){
        return "버스 번호: " + num
                + ", 버스 타입: " + type
                + ", 현재 위치: " + station
                + ", 남은 좌석: " + (maxPassenger - passingerCount)
                + ", 요금:" + finalPrice;
    }
    //하차합니다.
    void leave(){
        passingerCount--;
        System.out.println("1명 하차");
    }
    //버스의 현재 상태를 출력합니다.
    void stop(){
        super.stop();
        station++;
        if(station == stations.length){
            station = 0;
        }
        System.out.println("이번역은: " + stations[station]);
    }
    BusDiscount bd = new BusDiscount();
    //할인률 적용한 최종 가격
    int Price(int age, String met){
        finalPrice = (int)Math.round(price * (1 - bd.amountDiscount(age,met)));
        return finalPrice;
    }
    void sumPrice(){
        totalMoney += finalPrice;
        System.out.println("총 수익; " + totalMoney);
    }

}
