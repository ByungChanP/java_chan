package ch08;


//1~9 구구단
// 2 X 1 = 2  3 X 1 = 3
// 2 X 2 = 4 ....
public class ForTest6 {
    public static void main(String[] args){
        for (int i = 1; i  <= 9; i++ ){ //9행
            for(int k = 2; k <= 9; k++){ //8열
                System.out.print(k + "X" + i + "=" + (k * i) + "\t" );
            }
            System.out.println();
        }
    }
}
