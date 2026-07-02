package level02.day03;

public class Prob03 {
    void main() {

        int[] arr = {1, 2, 5, 6, 7, 4, 2, 1, 2};
        System.out.println(Select(arr));
    }

    int Count(int[] Array) {
        int[] arr = Array;
        int count;
        int max_count = 0;
        int max_index = 0;
        boolean same = false;
        for (int i = 0; i < arr.length; i++) {
            count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max_count) {
                max_count = count;
                max_index = i;
                same = false;
            } else if (count == max_count) {
                same = true;
            }
        }
        if (same) {
            return -1;
        }
        return max_index;
    }

    int Select(int[] Array){
        int[] arr = Array;
        if(arr.length == 1){
            return arr[0];
        }
        int num ;
        try {
            num = arr[Count(arr)];
        } catch (IndexOutOfBoundsException e) {
            num = -1;
        }
        return num;
    }
}