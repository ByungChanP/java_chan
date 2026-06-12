package ch10;

public class MethodTest {
    void main(String[] args){
        add();
        add100(20); //인자값을 보냄
        printSum(1, 10, 100);

        int result = getSum(10,20,30);
        System.out.println(result);
    }

    // 10과 100의 합계를 출력하는 메서드
    void add(){
        int n1 = 10;
        int n2 = 100;
        int sum = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + sum);

    }
    // 전달되는 인자와 100의 합계를 출력하는 메서드
    void add100(int n1){
        // n1을 따로 선언할 필요가 없다.
        int n2 = 100;
        int sum = n1 + n2;
        System.out.println(n1 + " + " + n2 + " = " + sum);
    }
    // 전달된 인자값 여러개의 합을 출력
    void printSum(int n1, int n2, int n3){
        int sum = n1 + n2 + n3;
        System.out.println(n1 + " + " + n2 + " + " +  n3 + " = " + sum);

    }// 인자값의 합을 반환한다
    int getSum(int n1, int n2, int n3) {
        int sum = n1 + n2 + n3;
        return sum;
    }
}
