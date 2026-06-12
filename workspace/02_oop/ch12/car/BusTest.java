package ch12.car;

public class BusTest {
    void main(){
        Bus mycar1 = new Bus("람보르기니", "10-2", "마을 버스"
                        , new String[]{"우리집", "김포고등학교", "김포 시청"}
                        , 1300, 15);
        mycar1.start();
        mycar1.speedUp(50);
        mycar1.stop();

        mycar1.ride();


        mycar1.start();
        mycar1.speedUp(50);
        mycar1.stop();
        mycar1.ride(4);
        mycar1.ride();
        mycar1.leave(5);
        mycar1.ride();
        mycar1.ride(7);
        mycar1.ride();
        mycar1.ride();
        mycar1.ride();
        mycar1.ride();
        mycar1.ride();


        Bus mycar2 = new Bus("전기버스", "3005", "광역 버스"
                , new String[]{"김포 시청", "발산역", "홍대역 ", "서울 시청" }
                , 3500, 30 );


        mycar2.start();
        mycar2.speedUp(50);
        mycar2.stop();
        mycar2.ride();
        mycar2.ride();
        mycar2.leave();
        mycar2.ride();
        mycar2.ride();
        mycar2.ride();
        mycar2.ride();
        mycar2.ride();
        mycar2.ride();
        mycar2.ride();



        System.out.println(mycar1);
        System.out.println(mycar2);
        // 버스 노선대이 같으면 같은 버스로 다루고 싶음
        System.out.println(mycar1.equals(mycar2));

    }
}
