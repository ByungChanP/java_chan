package team.cafe;

public class barista extends Employee {
    //메서드 오버라이딩
    protected void work(){
        super.work();
        System.out.println("원두를 갈아버리는 작업에 들어간다.");
        System.out.println("기계를 이용해 커피 원액을 추출한다.");
        System.out.println("뜨거운 물을 붓는다.");
        System.out.println("손님에게 전달한다.");
    }// 메서드 오버로딩
    protected void work(String ice){
        super.work(ice);
        System.out.println("원두를 갈아버리는 작업에 들어간다.");
        System.out.println("기계를 이용해 커피 원액을 추출한다.");
        System.out.println("차가운 물을 붓는다.");
        System.out.println("원액을 위에 얹는다.");
        System.out.println("손님에게 전달한다.");
    }// 메서드 오버라이딩
    protected  void clean(){
        System.out.println("책상과 바닥 청소를 한다.");
    }
}
