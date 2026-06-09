package ch12.family.ex02;

public class Daughter extends  Parent {
    // 생성자: 클래스명과 동일한 이름, 리턴 타입은 같음
    Daughter(String name){
        super(name);
    }
    void play(){
        System.out.println(name + ": 코노를 간다.");
    }
    void doFaceMask(){
        System.out.println(name + ": Mask팩을 한다.");
    }
}
