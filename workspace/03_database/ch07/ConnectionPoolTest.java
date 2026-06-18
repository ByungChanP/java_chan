package ch07;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// 성능이나 보안 측면에서 우수
public class ConnectionPoolTest {

    private static DataSource dataSource;

    // 최초로 한번만 선언함
    static {
        HikariConfig config = new HikariConfig("/hikari.properties");
        dataSource = new HikariDataSource(config);
    }



    public static void main (String[] args) {
        login("haru@gmail.com", "123");
        login("haru@gmail.com", "pwd123");


        findAll("자바");
//        insert(2, "2번이 등록한 게시글", "안녕하세요. 자바 공부 해요.");
//        findById(11);

//        update(10, "수정된 10번 게시글", "수정했어요");
//        findAll();

//        delete(10);
//        findAll("자바");

//        deleteALl(4);
//        findAll("자바");

        if(dataSource != null){
            ((HikariDataSource)dataSource).close();
        }
    }

    // 로그인
    public static void login(String email, String password){
        String sql = "select * from member where email = ? and password = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // 외부 요인으로 연결이 안될시 예외처리 할것
        try{ // 플랜 A

            // 1. 데이터 베이스 연결한다.(Connection 객체 생성)
            conn = dataSource.getConnection(); // db 접속에 필요한 로그인

            // 2. SQL 실행하는 객체 생성 (Statement 객체)
            pstmt = conn.prepareStatement(sql);

            // 3. SQL 실행 (SELECT)
            //4. 결과 수신 (ResultSet 객체 생성)
            pstmt.setString(1, email);
            pstmt.setString(2, password);
            rs = pstmt.executeQuery();
            // 결과 커서를 밑으로 내리는 작업
            if(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");

                System.out.println("로그인에 성공했습니다.");
                System.out.println("ID: " + id + ", 이메일: " + email + ", 이름: " + name + ", 전화번호: " + phone);
            }else{
                System.out.println("아이디와 비밀번호를 확인하세요");
            }
        } catch (Exception e) { // 플랜 B
            System.out.println("에러발생: " + e.getMessage());
            e.printStackTrace();

        }finally {
            //5. 생성된 리소스를 생성의 역순으로 해제한다. (연결 끊기)
            try { if(rs != null) rs.close(); } catch (Exception e) { }
            try { if(pstmt != null) pstmt.close(); } catch (Exception e) { }
            try { if(conn != null) conn.close(); } catch (Exception e) { }
        }
    }

    // 등록(C)
    static void insert(int memberId, String title, String content){
        String sql = "INSERT INTO post (member_id, title, content) VALUES (?, ?, ?)";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = dataSource.getConnection(); ;

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            pstmt = conn.prepareStatement(sql);

            // 3. SQL 실행
            pstmt.setInt(1, memberId);
            pstmt.setString(2,title);
            pstmt.setString(3,content);
            int affectedRows = pstmt.executeUpdate();

//            System.out.println("회원 등록 완료: " + affectedRows + "건 반영됨.");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }


    // 목록 조회(R)
    static void findAll(String keyword){
        // import 필요
        String sql = "Select id, title, view_count as viewCount, created_at as createdAt FROM  post";

        boolean hasKeyword = keyword != null && !keyword.equals("");
        if(hasKeyword){
            sql += " WHERE title like ? or content like ?";
        }

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // 외부 요인으로 연결이 안될시 예외처리 할것
        try{ // 플랜 A

            // 1. 데이터 베이스 연결한다.(Connection 객체 생성)
            conn = dataSource.getConnection();  // db 접속에 필요한 로그인

            // 2. SQL 실행하는 객체 생성 (Statement 객체)
            pstmt = conn.prepareStatement(sql);

            // 3. SQL 실행 (SELECT)
            //4. 결과 수신 (ResultSet 객체 생성)

            if(hasKeyword){
                pstmt.setString(1,"%" + keyword + "%");
                pstmt.setString(2,"%" + keyword + "%");
            }
            rs = pstmt.executeQuery();
            // 결과 커서를 밑으로 내리는 작업
            while(rs.next()){
                int id = rs.getInt("id");
                String title = rs.getString("title");
                int viewCount  = rs.getInt("viewCount");
                String createdAt = rs.getString("createdAt");

                System.out.println("ID: " + id + ", 제목: " + title + ", 조회수: " + viewCount + ", 작성일: " + createdAt);
            }
        } catch (Exception e) { // 플랜 B
            System.out.println("에러발생: " + e.getMessage());
            e.printStackTrace();

        }finally {
            //5. 생성된 리소스를 생성의 역순으로 해제한다. (연결 끊기)
            try { if(rs != null) rs.close(); } catch (Exception e) { }
            try { if(pstmt != null) pstmt.close(); } catch (Exception e) { }
            try { if(conn != null) conn.close(); } catch (Exception e) { }
        }
    }

    // 한건 조회(R)
    static void findById(int id){
        // import 필요
        String sql = "Select id, title, content, view_count as viewCount, created_at as createdAt FROM post where id = ?";
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        // 외부 요인으로 연결이 안될시 예외처리 할것
        try{ // 플랜 A

            // 1. 데이터 베이스 연결한다.(Connection 객체 생성)
            conn = dataSource.getConnection();  // db 접속에 필요한 로그인

            // 2. SQL 실행하는 객체 생성 (Statement 객체)
            pstmt = conn.prepareStatement(sql);
            // 3. SQL 실행 (SELECT)
            //4. 결과 수신 (ResultSet 객체 생성)
            pstmt.setInt(1, id);

            rs = pstmt.executeQuery();
            // 결과 커서를 밑으로 내리는 작업
            while(rs.next()){
                String title = rs.getString("title");
                String content = rs.getString("content");
                int viewCount  = rs.getInt("viewCount");
                String createdAt = rs.getString("createdAt");

                System.out.println("ID: " + id + ", 제목: " + title + ", 내용: " + content + ", 조회수: " + viewCount + ", 작성일: " + createdAt);
            }
        } catch (Exception e) { // 플랜 B
            System.out.println("에러발생: " + e.getMessage());
            e.printStackTrace();

        }finally {
            //5. 생성된 리소스를 생성의 역순으로 해제한다. (연결 끊기)
            try { if(rs != null) rs.close(); } catch (Exception e) { }
            try { if(pstmt != null) pstmt.close(); } catch (Exception e) { }
            try { if(conn != null) conn.close(); } catch (Exception e) { }
        }
    }

    // 수정(U)
    static void update(int id, String title, String content){

        String sql = "UPDATE post SET title = ? , content = ?  WHERE id = ?" ;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = dataSource.getConnection();

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            pstmt = conn.prepareStatement(sql);

            // 3. SQL 실행
            pstmt.setString(1, title);
            pstmt.setString(2, content);
            pstmt.setInt(3, id);
            int affectedRows = pstmt.executeUpdate();

            System.out.println("게시글 수정 완료: " + affectedRows + "건 반영됨.");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 삭제(D)
    static void delete(int id){
        String sql = "DELETE FROM POST WHERE ID= ?";
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = dataSource.getConnection();

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            pstmt = conn.prepareStatement(sql);

            // 3. SQL 실행
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();

            System.out.println("번 게시글 삭제 완료: " + affectedRows + "건 반영됨.");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 지정한 회원의 모든 게시글을 삭제
    static void deleteALl(int id){
        String sql = "DELETE FROM POST WHERE member_ID = ?" ;
        Connection conn = null;
        PreparedStatement pstmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = dataSource.getConnection();

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            pstmt = conn.prepareStatement(sql);

            // 3. SQL 실행
            pstmt.setInt(1, id);
            int affectedRows = pstmt.executeUpdate();

            System.out.println("번 회원의 모든 게시글 삭제 완료: " + affectedRows + "건 반영됨.");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(pstmt != null) pstmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }
}
