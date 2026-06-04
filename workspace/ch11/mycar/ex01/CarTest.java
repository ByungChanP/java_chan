package ch11.mycar.ex01;

public class CarTest {
    void main(){
        //Car 인스턴스를 생성한다.
        //인스턴스를 생성할 때 생성한 인스턴스의 타입이 된다.
        Car mycar = new Car(); // Car의 주소를 가져와 mycar 스택영역에 저장(참조)

        // 인스턴스의 필드나 메서드에 접근할 때 .연산자를 사용한다.
        mycar.model = "똥차 마티즈";

        mycar.start();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.gearUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();
        mycar.speedUp();

        mycar.stop();
    }
}
