package ch01;

// runtime 오류는 굳이 처리 안해도 됨, Exception 상위 인터페이스를 부모로 둔 경우 예외처리 진행해야함
public class LoginfailException  extends Exception{
    public LoginfailException(String message){
        super(message);
    }
}
