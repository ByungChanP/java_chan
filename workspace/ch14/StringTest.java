package ch14;

public class StringTest {
    public static void main(String[] args){
        //new 붙였을때 생성되는 메모리 모습에 차이가 있다.
                    //상수풀(메서드 영역)
        String s1 = "Hello"; // 스택 영역에 메서드 영역 주소로 젖장
        String s2 = new String("Hello"); // 스택 영역에 힙 주소 주소

        System.out.println(s1==s2);
        System.out.println(s1=="Hello");
        System.out.println(s2=="Hello");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Hello"));
        System.out.println(s2.equals("Hello"));

    }
}
