package ch11.statictest;

public class MainMethodTest {

    public void instanceMethod() {
        System.out.println("인스턴스 메서드 호출.");
    }
    public  static void staticMethod(){
        System.out.println("static 메서드 호출");

    }

//    public static void main(String[] args){
//        // 1. main 메서드에서 외부 메서드를 호출하는 방법
//        // 2. static 메서드를 그냥 호출
//        staticMethod();
//
//        // 3. 인스턴스를 생성한 후 호출
////        instanceMethod();
//        MainMethodTest m = new MainMethodTest();
//        m.instanceMethod();

void main(String[] args){
    staticMethod();
    instanceMethod();
    }
}
