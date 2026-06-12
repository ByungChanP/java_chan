package ch14;

public class StringTest {
    public static void main(String[] args){
        //new 붙였을때 생성되는 메모리 모습에 차이가 있다.
                    //상수풀(힙 영역)
        String s1 = "Hello"; // 스택 영역에 메서드 영역 주소로 저장 (100번지)
        String s2 = new String("Hello"); // 스택 영역에 힙 주소 s2의 인스턴스는 s1의 주소(100번지)를 참조 (101번지)

        System.out.println(s1==s2); // 100 == 101?
        System.out.println(s1=="Hello"); // 100 == 100?
        System.out.println(s2=="Hello"); // 101 == 100?
        // 값을 비교함
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("Hello"));
        System.out.println(s2.equals("Hello"));

        s1 += " World";
        s1 += " Java";
        s1 += " Program";
        System.out.println(s1);
    }
}
