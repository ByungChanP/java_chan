package ch13.familly.ex02;

public class Test {
    public static void main(String[] args){
        // 추상클래스는 객체생성이 안된다.
//        Parent p = new Parent("부모"); // 지역변수는 중괄호 안에서만
        Parent p = new Son("아들");
//        Daughter p = new Daughter("딸내미");
        dailySchedule(p);
            //1번 방안
//        Test t = new Test();
//        t.dailySchedule();
    }
    //부모의 하루일과
    private static void dailySchedule(Parent p){ // 부모 타입으로 만들어짐
        p.eat();
        p.play();
        p.study();
        p.sleep();
    }

//    private static void dailySchedule(Son p){ // 부모 타입으로 만들어짐
//        p.eat();
//        p.play();
//        p.sleep();
//    }
//    private static void dailySchedule(Daughter p){ // 부모 타입으로 만들어짐
//
//        p.play();
//
//    }
}
