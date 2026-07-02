package ch04.echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// 클라이언트로부터 수신된 메세지를 그대로 반송
// 네트워크 프로그램 개발 시 가장 먼저 만들어서 클라이언트와 서버간의 통신 상태를 확인하는데 사용
public class EchoServer {
    void startServer(){
        try(
                //서버 소켓을 생성
                java.net.ServerSocket ss = new ServerSocket(50000);

        ){
            System.out.println("ServerSocket 생성 완료");
            // 클라이언트 접속 대기
            Socket s = ss.accept();
            System.out.println("클라이언트 접속:" + s.getInetAddress().getHostAddress());

            // 클라이언트의 메세지를 수신하는 InputStream 생성
            InputStream in = s.getInputStream();
            // 클라이언트의 메세지를 전송하는 OutputStream 생성
            OutputStream out = s.getOutputStream();

            int readData = 0;
            // -1은 입력이 끝나서 더이상 읽을 수 없음
            while ((readData = in.read()) != -1){
                out.write(readData);
                System.out.write(readData);
            }

        }catch (IOException e){
            System.err.println("네트워크 오류: " + e.getMessage());
        }


    }
    void main(){
        startServer();
    }
}
