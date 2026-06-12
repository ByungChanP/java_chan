package ch13.familly.ex02;

public class Son extends Parent{

    // 생성자: 클래스명과 동일한 이름, 리턴 타입은 같음
    Son(String name){
        super(name);
    }


    void eat(){
        System.out.println(name + ": 음식을 맛있게 먹는다.");

    }
    void play(){
        System.out.println(name + ": 게임을 한다.");

    }
    void sleep(){
        System.out.println(name + ": 꿀잠을 잔다.");

    }
    public void study(){
        System.out.println(name + ": 공부를 한다.");
    }

}
