package ch13.familly.ex01;

public class Parent {
    String name;
    // 생성자: 클래스명과 동일한 이름, 리턴 타입은 같음
    Parent(String name){
        this.name = name;
    }


    void eat(){
        System.out.println(name + ": 음식을 맛있게 먹는다.");

    }
    void play(){
        System.out.println(name + ": 등산한다.");

    }
    void sleep(){
        System.out.println(name + ": 꿀잠을 잔다.");

    }

}
