package ch11.statictest;

public class MathUtil {
    // 메서드 메모리 영역
    // 모든 class에서 정의한 변수가 모두 메서드에 정의되어 인스턴스를 만들 필요가 없음
    final static double PI = 3.14159; //상수 선언으로 변수명은 대문자 , 변경 불가능
    int r = 5; // 인스턴스 필드 new를 통해 만들어야 사용가능

    // 원의 반지름을 구한다.
    static void area(){
        //static 메서드에서는 static 필드나 static 메서드만 사용가능
//        System.out.println(PI * r * r);
    }

    // 메서드 내부에서 인스턴스 필드 혹은 메서드를 사용하지 않을 경우에만 static을 붙이면된다.
    static int add(int n1, int n2){
        return  n1 + n2;
    }
}
