package level02.day03;

import java.util.Arrays;

public class Prob02 {

    void main() {
        int[] new_arr = {1, 2, 7, 11, 10};
        Arrays.sort(new_arr);
        for(int arrs : new_arr){
            System.out.println(arrs);
        }
        System.out.println(new_arr[new_arr.length/2]);
    }
}


