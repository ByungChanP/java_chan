package ch05;

public class TypeCastingTest {
    static void main() {
        int a  = 2100000000;
            // double b = (double) a;
        double b = a;//  자동 형변환 (a가 double로 반환)

        System.out.println(a);
        System.out.println(b);

        double pi = 3.14;
        int p = (int)pi;
        System.out.println(pi);
        System.out.println(p);
    }
}
