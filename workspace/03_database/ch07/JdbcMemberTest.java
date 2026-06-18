package ch07;
// 자바가 만든 표준 인터페이스
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcMemberTest {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/board_db?serverTimezone=UTC&useSSL=false&allowPublicKeyRetrieval=true";
    private static final String DB_USER = "user1";
    private static final String DB_PASSWORD = "1111";



    public static  void main(String[] args){
//        login("haru@gmail.com", "123");
        login("haru@gmail.com", "pwd123");
        deleteMember(2);
    }

    // 로그인
    public static void login(String email, String password){
        String sql = "select * from member where email = '"+email+"' or '1' = '1' and password = '"+password+"'";
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        // 외부 요인으로 연결이 안될시 예외처리 할것
        try{ // 플랜 A

            // 1. 데이터 베이스 연결한다.(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); // db 접속에 필요한 로그인

            // 2. SQL 실행하는 객체 생성 (Statement 객체)
            stmt = conn.createStatement();

            // 3. SQL 실행 (SELECT)
            //4. 결과 수신 (ResultSet 객체 생성)
            rs = stmt.executeQuery(sql);
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
            try { if(stmt != null) stmt.close(); } catch (Exception e) { }
            try { if(conn != null) conn.close(); } catch (Exception e) { }
        }
    }


    // 모든 회원 목록 조회
    public static void selectAllMembers(){
        // import 필요
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        // 외부 요인으로 연결이 안될시 예외처리 할것
        try{ // 플랜 A

            // 1. 데이터 베이스 연결한다.(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD); // db 접속에 필요한 로그인

            // 2. SQL 실행하는 객체 생성 (Statement 객체)
            stmt = conn.createStatement();

            // 3. SQL 실행 (SELECT)
            //4. 결과 수신 (ResultSet 객체 생성)
            rs = stmt.executeQuery("select * FROM  member");
            // 결과 커서를 밑으로 내리는 작업
            while(rs.next()){
                int id = rs.getInt("id");
                String email = rs.getString("email");
                String name = rs.getString("name");
                String phone = rs.getString("phone");

                System.out.println("ID: " + id + ", 이메일: " + email + ", 이름: " + name + ", 전화번호: " + phone);
            }
        } catch (Exception e) { // 플랜 B
            System.out.println("에러발생: " + e.getMessage());
            e.printStackTrace();

        }finally {
            //5. 생성된 리소스를 생성의 역순으로 해제한다. (연결 끊기)
            try { if(rs != null) rs.close(); } catch (Exception e) { }
            try { if(stmt != null) stmt.close(); } catch (Exception e) { }
            try { if(conn != null) conn.close(); } catch (Exception e) { }
        }
    }

    // 회원 등록
    public static void insertMember(String email, String password, String name, String phone, int recommenderId){
        Connection conn = null;
        Statement stmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행
            int affectedRows = stmt.executeUpdate("INSERT INTO member (email, password, name, phone, recommender_id) VALUES \n" +
                    "    ('"+email+"', '"+password+"', '"+name+"', '"+phone+"', "+recommenderId+")");

            System.out.println("회원 등록 완료: " + affectedRows + "건 반영됨.");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 회원 수정
    public static void updateMember(int id, String password, String name, String phone){
        Connection conn = null;
        Statement stmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            // 3. SQL 실행
            int affectedRows = stmt.executeUpdate(
                    "UPDATE member SET password = '"+password+"', name = '"+name+"', phone = '"+phone+"' WHERE id = " + id);

            System.out.println("회원 수정 완료: " + affectedRows + "건 반영됨.");

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }

    // 회원 삭제 (게시글도 같이 삭제)
    public static void deleteMember(int id){
        Connection conn = null;
        Statement stmt = null;

        try{ // 플랜 A
            // 1. 데이터베이스 연결(Connection 객체 생성)
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

            // 2. SQL 실행 객체 생성(Statement 객체 생성)
            stmt = conn.createStatement();

            conn.setAutoCommit(false);

            // 3. SQL 실행
            int affectedRows = stmt.executeUpdate("DELETE FROM post WHERE member_id=" + id);
            System.out.println("회원의 모든 게시글을 삭제 완료: " + affectedRows + "건 반영됨.");

            // 10동안 휴식
            Thread.sleep(1000*10);

            affectedRows = stmt.executeUpdate("DELETE FROM member WHERE id=" + id);
            System.out.println("회원 삭제 완료: " + affectedRows + "건 반영됨.");

            conn.commit();

        }catch(Exception e){ // 플랜 B
            System.out.println("에러 발생: " + e.getMessage());
            e.printStackTrace();
            try{ if(conn != null) conn.rollback(); } catch (Exception e2){}
            e.printStackTrace();

        }finally{
            // 5. 생성된 리소스를 생성의 역순으로 해제
            try{ if(stmt != null) stmt.close(); } catch (Exception e){ }
            try{ if(conn != null) conn.close(); } catch (Exception e){ }
        }
    }
}
