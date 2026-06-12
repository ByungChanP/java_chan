package ch13.familly.ex01;

public class Test {
    public static void main(String[] args){
//        Parent p = new Parent("부모"); // 지역변수는 중괄호 안에서만
//        Son p =  new Son("아들"); // up casting 자동 형변환 자식 -> 부모
        Daughter p = new Daughter("딸내미");
        dailySchedule(p);
            //1번 방안
//        Test t = new Test();
//        t.dailySchedule();
    }
    //부모의 하루일과
    private static void dailySchedule(Parent p){ // 부모 타입으로 만들어짐

        p.eat();
        p.play();
        if(p instanceof Son) {// p가 Son 인스턴스인지 여부를 체크)
            Son s = (Son) p; // down castiong 부모 -> 자식
            s.study();
        }
        p.sleep();
    }

//    private static void dailySchedule(Son p){ // 부모 타입으로 만들어짐
//        p.work();
//        p.eat();
//        p.play();
//        p.sleep();
//    }
//    private static void dailySchedule(Daughter p){ // 부모 타입으로 만들어짐
//        p.eat();
//        p.play();
//        p.doFaceMask();
//        p.sleep();
//
//    }
}
