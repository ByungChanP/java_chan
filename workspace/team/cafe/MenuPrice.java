package team.cafe;

public class MenuPrice{

    protected String Menu;
    protected int Price;

    int select(String m) {
        switch (m) {
            case "아메리카노" -> {
                this.Menu = "아메리카노";
                this.Price = 1500;

            }
            case "아이스 아메리카노" -> {
                this.Menu = "아메리카노 아이스";
                this.Price = 2000;

            }
            default -> {
                this.Menu = "없는 메뉴";
                this.Price = 0;
            }
        }
        return Price;
    }
}
