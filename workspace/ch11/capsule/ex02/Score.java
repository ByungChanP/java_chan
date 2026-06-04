package ch11.capsule.ex02;


// 시험 결과를 관리하는 클래스
// 캡슐화를 통해 불필요한 sum 호출을 막음
public class Score {
    // 외부 클래스에서 변수 초기화 하는것을 막기 위한 조치
    private int kor;
    private int eng;
    private int math;

    public Score(int kor, int math) {
        this.kor = kor;
        this.math = math;
    }


    // Getter 메서드
    public int getMath(){
        return this.math;
    }

    // Setter 메서드
    public void setMath(int math){ //수학 점수를 새로운값으로 교체한다.
        if(math > 100 || math< 0 ){
            System.out.println("0~100 사이로 입력해야 합니다.");
        }else{
            this.math = math;
        }
    }

    Score(int kor, int eng, int math) {
        if(kor > 100 || kor < 0){
            System.out.println("kor 값은 0~100 사이로 입력해야 합니다.");
        }else{
            this.kor = kor;
        }

        if(eng > 100 || eng < 0){
            System.out.println("eng 값은 0~100 사이로 입력해야 합니다.");

        }else{
            this.eng = eng;
        }

        if(math > 100 || math < 0){
            System.out.println("math 값은 0~100 사이로 입력해야 합니다.");
        }else{
            this.math = math;
        }
    }

    // 총점을 계산해서 반환하는 메서드
    public int sum() {
        return kor + eng + math;
    }
    // 평균을 계산해서 반환하는 메서드(소수 셋째자리에서 반올림)
    double avg() {
        return Math.round(100 * sum() / 3.0) / 100.0  ;
    }
}
