package ch03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// 4. 파일(output.txt) -> 파일(output-copy.txt)
public class FileToFile {
    void main(){
        try (
                FileInputStream fos1 = new FileInputStream("output.txt");
                FileOutputStream fos2 = new FileOutputStream("output - copy.txt");
                ){

            // 표준 입력 장지로 부터 1byte 읽어온다.
            int readData = 0;
            // -1은 입력이 끝나서 더이상 읽을 수 없음
            while((readData = fos1.read()) != -1){
                // 표준 출력 장치로 1byte 출력한다.
                // 버퍼에만 저장
                fos2.write(readData);
            }
        }catch (IOException e){
            System.err.println("입출력 에외 발생: " + e.getMessage());

        }
    }
}
