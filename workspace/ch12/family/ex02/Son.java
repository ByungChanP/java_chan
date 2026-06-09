package ch12.family.ex02;

// Son이 Parrent의 필드와 메서드를 상속받는다.

public class Son extends Parent {
    // 생성자를 제외한 전부 상속됨
    Son(String name) {
        super(name); // 부모의 생성자를 호출
    }
    // 오버라이딩: 상속받은 메서드를 재정의 한다.
    void play(){
        work();
        System.out.println(name + ": 게임한다.");

    }
    private void work(){
        System.out.println(name + ": 일한다.");
    }

    public void study(){
        System.out.println(name + ": 도서관에서 공부한다.");
    }
}
