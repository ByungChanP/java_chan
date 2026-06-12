package ch13.familly.ex02;

// 추상클래스로 변경
public abstract class Parent {

    String name;
    // 생성자: 클래스명과 동일한 이름, 리턴 타입은 같음
    Parent(String name) {
        this.name = name;
    }


    void eat () {
        System.out.println(name + ": 음식을 맛있게 먹는다.");

        }

    void play () {
        System.out.println(name + ": 등산한다.");

        }

    void sleep () {
        System.out.println(name + ": 꿀잠을 잔다.");

        }
        // 자식이 오버라이딩 하길 원함
        // 추상 메서드 실체가 없음 -> 자식이 강제 오버라이딩 지정
    public abstract void study ();

}
