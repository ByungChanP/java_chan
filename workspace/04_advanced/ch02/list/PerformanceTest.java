package ch02.list;

public class PerformanceTest {
    void main(){
        int times = 150000;
        MyArray list = new MyArray();
        long start = System.currentTimeMillis();
//        addFirst(list, times);
        addLast(list, times);
        System.out.println("저장된 수: " + list.size());
        long end = System.currentTimeMillis();
        System.out.println("소요 시간: " + (end-start) + "ms");
    }
    // list를 이용하여 맨 앞에 times 만큼의 데이터를 추가한다.
    void addFirst(MyArray list, int times){
        for(int i=0;i<times; i++){
            list.append(0,"데이터-" + i);
        }
    }
    // list를 이용하여 맨 앞에 times 만큼의 데이터를 추가한다.
    void addLast(MyArray list, int times) {
        for (int i = 0; i < times; i++) {
            list.append("데이터-" + i);
        }
    }
}
