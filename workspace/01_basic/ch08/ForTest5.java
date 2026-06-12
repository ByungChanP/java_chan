package ch08;

public class ForTest5 {
    public static void main(String[] args) {
//        star1();
//        star2();
//        star3();
          star4();
//        star5();
    }

    //*
    //**
    //***
    //****
    //*****
    // ********* .... 50줄 출력
    static void star1() {
        for (int i = 0; i < 1; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 2; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 3; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 4; i++) {
            System.out.print("*");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print("*");
        }
        System.out.println();

    }

//    50계단 만들기
//    static void star2() {
//        for (int i = 1; i <= 50; i++) {
//            String star = "*";
//            String result = star.repeat(i);
//            System.out.print(result);
//            System.out.println();
//        }
//        System.out.println();
//
//
//    }
//    static  void star2() {
//        //이중 for문
//        for(int i = 0; i < 50; i++){
//            for(int k = 0; k < (i + 1); k++){ // i->0 k ->1 별1개, i->1 k->2 별2개
//                System.out.print("*"); // ** 출력됨
//            }
//            System.out.println();
//        }
//    }
//
// 별 5개부터 하나씩 줄이는 모양
//    static void star3() {
//        for(int i = 0; i < 5 ; i++){
//            for(int k = 0; k < (5 - i); k++){ // i->0 k ->1 별1개, i->1 k->2 별2개
//                System.out.print("*"); // ** 출력됨
//            }
//            System.out.println();
//        }
//    }
    static  void star4() {
        //이중 for문
        for(int i = 0; i < 5; i++){ // i는 행     ,i가 0인경우
            for(int k = 0; k < (5-1-i); k++){ //  k -> 0,1,2,3 (4번) 띄어쓰기
                System.out.print(" "); // ** 출력됨
            }
            for(int k = 0; k < (i+1); k++) { //  k -> 0 (1번) *
                System.out.print("*"); // ** 출력됨
            }
            System.out.println(); //줄 바꿈 이후 반복
        }
    }



// 오른쪽으로 정렬된 삼각형

//
//    static void star5() {
//        for (int i = 0; i < 5; i++) {
//            System.out.print("*");
//        }
//        System.out.println();
//    }
}