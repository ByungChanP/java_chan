static int i;
    void main() {
        String A = "안녕하세요 ";
        String B = "저는 ";
        String C = " ___입니다. ";
        String D = A + B + C;
        int number = 0;
        while (number < 4) {
            System.out.println(D);
            number = number + 1;
        }
        for (int i = 4; i > 0; i--) {
            System.out.println(i);
        }
        System.out.print(i);
    }
