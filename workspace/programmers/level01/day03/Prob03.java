package level01.day03;

public class Prob03 {
    void main(){
        String my_string = "love";
        System.out.println(multiple(my_string, 10));
    }
    String multiple(String my_string, int k) {
        String str = my_string;
        String mulstr = "";
        for(int i=0; i<k; i++){
            mulstr += str;
        }
        return mulstr;
    }
}
