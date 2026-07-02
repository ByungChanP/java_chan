package ch03;

import java.io.IOException;

// 1. 표준입력장치(키보드) -> 표준출력장치(콘솔)
public class KeyboardToConsole {
    void main(){
        try {
            // 표준 입력 장지로 부터 1byte 읽어온다.
            int readData = 0;
            // -1은 입력이 끝나서 더이상 읽을 수 없음
            while((readData = System.in.read()) != -1){
                // 표준 출력 장치로 1byte 출력한다.
                // 버퍼에만 저장
                System.out.write(readData);
            }
        }catch (IOException e){
            System.err.println("입출력 에외 발생: " + e.getMessage());

        }
    }
}
