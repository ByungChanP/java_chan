package ch13.supercar;

public class Driver {
    void drive(SuperCar car){
        // 2
        car.move();
        // if else문은 전기차가 나오면 계속 작성하는 번거로움이 있음 --> 인터페이스 샤용
        if(car instanceof Chargeable){
            ((Chargeable)car).charge();
        }
    }
}
