package ch11.mycar.ex02;

public class Car {

    // 필드 (8+4+4) byte
    String model;// NULL
    int speed; // 필드를 초기화 하지않으면 기본값으로 0지정 //메서드 안의 지역변수는 무조건 초기값 지정해줘야함
    int gear; // 수동식

    // 생성자: 인스턴스가 생성될 때 자동으로 호출되는 메서드
    // 생성자를 하나도 만들지 않을 경우 자바 컴파일러가 자동으로 기본 생성자를 만들어줌
    // 생성자를 하나라도 명시적으로 만들었을 경우 기본 생성자가 만들어지지 않음
    // 기본 생성자: 매개변수가 없는 생성자

//    Car(){
//        System.out.println("Car() 생성자 호출됨");
//    }
//
//    Car(String model){ // 오버로딩
//        this.model = model;
//        System.out.println("Car " + model + " 생성자 호출됨");
//    }

    Car(String name){ // 오버로딩
        System.out.println("Car " + name + " 생성자 호출됨");
        System.out.println(model);
        model = name; // 초기화
        System.out.println(model);
    }

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
