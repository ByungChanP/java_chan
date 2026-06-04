package ch11;

public class MemberTest {
    String id;

//     생성자 정의: 리턴 타입은 없음, 이름은 클래스명과 동일해야함
    MemberTest(String id){
        this.id = id;
    }


    public static void main(String[] args){
        MemberTest member = new MemberTest("Park");
        System.out.println("회원 아이디: " + member.id);
    }
}
