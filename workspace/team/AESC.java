package team;

public class AESC { // 오름차순 정렬 알고리즘 결과 보기 편하게
    public static void main(String[]args){
        System.out.println("정말 어려운 같은 숫자 갯수 구하기");
        int[] number = {9,5,4,2,5,7,9,2,5,0 };
        int temp = 0;
        for(int i = 0; i < number.length ; i++) {
            for(int j = 0; j < number.length -1; j++) {
                if (number[j] > number[j + 1]) {
                    temp = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = temp;
                } else {
                    continue;
                }
            }
        }
        for(int k = 0; k < number.length; k++) {
            System.out.print(number[k]);
        }
        System.out.println();
        // 갯수 구하기
        for(int i = 0; i < number.length; i++){
            int cnt = 0;
            for(int j = 0; j < number.length; j++){
                if(number[i] == number[j]){
                    cnt++ ;
                }else {
                    continue;
                }
            }
            System.out.println( number[i] + "의 갯수는 " + cnt + "입니다.");
        }
    }
}
