package team.cafe;

public class orderInfo {
    private static int number; // 주문 번호
    private String memu;// 메뉴 종류
    private int count; // 갯수
    private int price; // 가격
    public int amount;

    //결과 출력
    void ord(String menu, int count){
        MenuPrice mp = new MenuPrice();
        mp.select(menu);
        this.memu = menu;
        this.count = count;
        this.price = mp.Price;
        this.amount = price * count;

        number++;

        System.out.println("주문번호: " + number
                + "\n메뉴: " + menu
                + "\n가격: " + price
                + "\n수량: " + count
                + "\n총액: " + price * count );

    }
}
