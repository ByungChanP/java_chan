package ch01;

public class TryCatchTest {
    void main(){
        devide(100, new String[] {"hello"}); // 정상
        devide(100, new String[] {""}); // 0으로 나누는 예외
        devide(100, new String[] {});   //
        devide(100, null);   //

    }
    // num1을 arr 배열의 index 0값을 꺼내서 앞뒤 공백을 제거한 후 문자열의 길이로 나눈 결과를 출력
    void devide(int num1, String[] arr){

        try{
            int num2 = arr[0].trim().length(); // arr[0]이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // arr[0]이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch(ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }catch(NullPointerException e) {
            System.out.println("arr[0]이 null입니다.");
            return;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arr의 사이즈가 0입니다.");
        }finally{
            System.out.println("finally는 try-catch 블럭이 실행된 뒤 항상 실행을 보장."); // 무조건 실행함
        }
        System.out.println("finally는 try-catch 블럭이 실행된 뒤 항상 실행운 무슨 차이?"); // 무조건 실행함

    }
}
