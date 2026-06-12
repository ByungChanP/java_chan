package ch13.supercar;

public class SuperCar {

    int zero100;
    // 기본생성자가 아닌 생성자를 하나 추가했기 때문에 발생 --> 강한 결합 상태
    SuperCar(int zero100){
        this.zero100 = zero100;
    }

    void move(){
        // 4
        System.out.println("슈퍼카가 100m를 달리는데 " + zero100 + "초 걸린다." );
    }
}
