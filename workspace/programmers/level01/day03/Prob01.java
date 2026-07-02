package level01.day03;

public class Prob01 {
    void main(){
        String str1 = "aaaaa";
        String str2 = "bbbbb";
        System.out.println(mix(str1,str2));
    }
    String mix(String str1,String str2){
        String s1 = str1;
        String s2 = str2;
        String s3 = "";
        // 문자열 길이의 -1번 extract 추출 함수를 반복하고 s3에 문자를 합쳐 반환
        for(int i=0; i<s1.length(); i++){
            String e = extract(s1, s2, i,i+1);
            s3 += e;
        }
        return s3;
    }

    String extract(String str1,String str2, int start, int end ){
        String a = str1.substring(start, end);
        String b = str2.substring(start, end);
        String c = a+b;
        return c;
    }
}
