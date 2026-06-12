package ch12.animal;

public class Test {
    public static void main(String[] args){

//        Dog mong = new Dog();
        // 동물에 정의되어 있는 메서드만 사용 가능
        Animal mong = (Animal)new Dog(); // 자식이 부모 타입으로 형변환(자동) 업케스팅 묵시적 형변환
//        mong.eat(); // 부모에게 물려받은 상속
//        mong.bark(); // 추가한 메서드

        animalCare(mong);

        Animal c = new Cat();
        animalCare(c);
    }

    // 동물의 관리 서비스 Dog 서비스가 아니기 때문
    static void animalCare(Animal a){
        a.eat();
        a.move();
        a.sleep();
//        a.bark(); // Animal에는 정의 되어 있지 않음
//        a.liquefy();
    }
//    //고양이 관리 시스템
//    static void animalCare(Dog a){
//        a.eat();
//        a.move();
//        a.bark();
//        a.sleep();
//
//    }
//
//    //고양이 관리 시스템
//    static void animalCare(Cat c){
//        c.eat();
//        c.move();
//        c.liquefy();
//        c.sleep();
//
//    }
}
