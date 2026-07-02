package ch03;

import java.io.*;

// 4. 파일(output.txt) -> 파일(output-copy.txt)
public class FileCopyTest {

    void main() {
//        long start = System.currentTimeMillis();
//        copyFile("lib/mysql-connector-j-9.7.0.jar", "mysql-connector-j-9.7.0.jar");
//        long end = System.currentTimeMillis();
//        System.out.println("소요시간: " + (end - start) + "ms");

        long startBuffer = System.currentTimeMillis();
        copyFileUseBuffer("lib/mysql-connector-j-9.7.0.jar", "mysql-connector-j-9.7.0.jar");
        long endBuffer = System.currentTimeMillis();
        System.out.println("소요시간: " + (endBuffer - startBuffer) + "ms");

//        long startCustomBuffer = System.currentTimeMillis();
//        copyFileCustomBuffer("lib/mysql-connector-j-9.7.0.jar", "mysql-connector-j-9.7.0.jar");
//        long endCustomBuffer = System.currentTimeMillis();
//        System.out.println("소요시간: " + (endCustomBuffer - startCustomBuffer) + "ms");
    }


    /**
     * 스트림을 이용하여 파일을 복사함
     *
     * @param org  원본 파일명
     * @param dest 복사하여 새로 만든 파일명
     */
    void copyFile(String org, String dest) {
        try (
                FileInputStream fos1 = new FileInputStream(org);
                FileOutputStream fos2 = new FileOutputStream(dest);
        ) {

            // 표준 입력 장지로 부터 1byte 읽어온다.
            int readData = 0;
            // -1은 입력이 끝나서 더이상 읽을 수 없음
            while ((readData = fos1.read()) != -1) {
                // 표준 출력 장치로 1byte 출력한다.
                // 버퍼에만 저장
                fos2.write(readData);
            }
        } catch (IOException e) {
            System.err.println("입출력 에외 발생: " + e.getMessage());

        }
    }

    void copyFileCustomBuffer(String org, String dest) {
        try (
                FileInputStream fos1 = new FileInputStream(org);
                FileOutputStream fos2 = new FileOutputStream(dest);
                // 버퍼 추가
                InputStream bis = new BufferedInputStream(fos1);
                OutputStream bos = new BufferedOutputStream(fos2);
        ) {

            // 표준 입력 장지로 부터 1byte 읽어온다.
            byte[] buffer = new byte[1024 * 8];
            int readsize = 0;
            // -1은 입력이 끝나서 더이상 읽을 수 없음
            while ((readsize = bis.read()) != -1) {
                // 표준 출력 장치로 1byte 출력한다.
                // 버퍼에만 저장
                bos.write(buffer, 0, readsize);
            }
        } catch (IOException e) {
            System.err.println("입출력 에외 발생: " + e.getMessage());

        }
    }

    void copyFileUseBuffer(String org, String dest) {
        try (
                FileInputStream fos1 = new FileInputStream(org);
                FileOutputStream fos2 = new FileOutputStream(dest);
                // 버퍼 추가
                InputStream bis = new BufferedInputStream(fos1);
                OutputStream bos = new BufferedOutputStream(fos2);
        ) {

            // 표준 입력 장지로 부터 1byte 읽어온다.
            int readData = 0;
            // -1은 입력이 끝나서 더이상 읽을 수 없음
            while ((readData = bis.read()) != -1) {
                // 표준 출력 장치로 1byte 출력한다.
                // 버퍼에만 저장
                bos.write(readData);
            }
        } catch (IOException e) {
            System.err.println("입출력 에외 발생: " + e.getMessage());

        }
    }
}




