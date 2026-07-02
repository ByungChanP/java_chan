package ch04.echo;

import java.io.*;
import java.net.Socket;

public class EchoClient {


    void startClient() {
        // 서버에 접속 요청
        try (Socket s = new Socket("localhost", 50000);
//        try (Socket s = new Socket("dain2.iptime.org", 50000);
             InputStream in = s.getInputStream();
             OutputStream out = s.getOutputStream()
        ) {
            int readData = 0;
            // -1은 입력이 끝나서 더이상 읽을 수 없음
            while ((readData = System.in.read()) != -1) {
                out.write(readData);
                int echoData = in.read();
                System.out.write(echoData);
            }

        } catch (IOException e) {
            System.err.print("네트워크 오류 발생: " + e.getMessage());
        }
    }

    void main(){
        startClient();
    }
}