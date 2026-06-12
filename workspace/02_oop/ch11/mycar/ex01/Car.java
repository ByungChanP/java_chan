package ch11.mycar.ex01;

public class Car {
    // 필드
    String model;// NULL
    int speed; // 필드를 초기화 하지않으면 기본값으로 0지정 //메서드 안의 지역변수는 무조건 초기값 지정해줘야함
    int gear; // 수동식

    //10km/h 가속한다.
    void speedUp(){
        speed += 10;
        System.out.println("가속합니다. 현재 속도는 " + speed + "km/h 입니다.");
    }

    //10km/h 감속한다.
    void speedDown(){
        speed -= 10;
        System.out.println("감속합니다. 현재 속도는 " + speed + "km/h 입니다.");
    }

    // 기어를 1단 올린다.
    void gearUp(){
        gear++;
        System.out.println("기어를 한 단계 올립니다. 현재 기어는 " + gear + "단 입니다.");
    }

    // 기어를 1단 내린다.
    void gearDown(){
        gear--;
        System.out.println("기어를 한 단계 내립니다. 현재 기어는 " + gear + "단 입니다.");
    }

    // 출발한다.
    void start(){
        System.out.println("출발합니다.");
        gearUp();
        speedUp();

    }

    // 멈춘다.
    void stop(){
        System.out.println("멈춥니다.");
        gear = 0;
        while(speed > 0){
            speedDown();
        }
    }
}
