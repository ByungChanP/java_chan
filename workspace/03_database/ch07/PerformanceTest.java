package ch07;

public class PerformanceTest {
    public static void main(String[] args){
        ConnectionPoolTest.findAll("자바");

        long start1 = System.currentTimeMillis();
        System.out.println("첫번 째 테스트 시작");
        for(int i=1; i<=10; i++){
            jdbcPostPreparedTest.insert(2,"커넥션 풀 사용 안함 - " + i, "내용");
        }
        long end1 = System.currentTimeMillis();
        System.out.println("첫번 째 테스트 종료");
        System.out.println("커넥션 풀이 없을경우 소요 시간: " + (end1 - start1) + "ms");



        long start2 = System.currentTimeMillis();
        System.out.println("첫번 째 테스트 시작");
        for(int i=1; i<=10; i++){
            ConnectionPoolTest.insert(2,"커넥션 풀 사용함 - " + i, "내용");
        }
        long end2 = System.currentTimeMillis();
        System.out.println("첫번 째 테스트 종료");
        System.out.println("커넥션 풀이 사용할 경우 소요 시간: " + (end2 - start2) + "ms");

    }
}
