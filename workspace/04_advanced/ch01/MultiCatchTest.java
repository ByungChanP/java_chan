package ch01;

public class MultiCatchTest {
    void main(){
//        devide(100, new String[] {"hello"}); // 정상
//        devide2(100, new String[] {""}); // 0으로 나누는 예외
//        devide3(100, new String[] {});   //
        devide4(100, new String[] {"hello"}); // 정상
        devide4(100, new String[] {""}); // 0으로 나누는 예외
        devide4(100, new String[] {});   //
        devide4(100, null);   //

    }
    // num1을 arr 배열의 index 0값을 꺼내서 앞뒤 공백을 제거한 후 문자열의 길이로 나눈 결과를 출력
    void devide(int num1, String[] arr){

        try{
            int num2 = arr[0].trim().length(); // arr[0]이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // arr[0]이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }catch(ArithmeticException | NullPointerException e){
            System.out.println("에러발생: " + e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("arr의 사이즈가 0입니다.");
            return;
        }finally{
            System.out.println("finally는 try-catch 블럭이 실행된 뒤 항상 실행을 보장."); // 무조건 실행함
        }
        System.out.println("finally는 try-catch 블럭이 실행된 뒤 항상 실행운 무슨 차이?"); // 무조건 실행함

    }

    void devide2(int num1, String[] arr) {

        try {
            int num2 = arr[0].trim().length(); // arr[0]이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // arr[0]이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (Exception e) { // 업케스팅
            System.out.println("에러발생: " + e.getMessage());
        }
    }


    void devide3(int num1, String[] arr) {

        try {
            int num2 = arr[0].trim().length(); // arr[0]이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // arr[0]이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        } catch (Exception e) { // 업케스팅
            System.out.println("에러발생: " + e.getMessage());
        }
    }


    void devide4(int num1, String[] arr){

        if(arr != null && arr.length > 0 && arr[0] != null && arr[0].trim().length() > 0){
            int num2 = arr[0].trim().length(); // arr[0]이 null일 경우 NullPointerException 발생
            int result = num1 / num2; // arr[0]이 ""일 경우 ArithmeticException 발생
            System.out.println(num1 + " / " + num2 + " = " + result);
        }
    }
}
