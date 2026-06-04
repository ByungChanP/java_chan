package team.Store;

public class ProductTest {
    public static void main(String[]args){

        Product P1 = new Product();
        P1.productId = "ssgnote9";
        P1.productName = "갤럭시노트9";
        P1.productArea = "경기도 수원";
        P1.price = 960000;
        P1.tax = 10.0;

        Product P2 = new Product();
        P2.productId = "igxnote5";
        P2.productName = "LG스마트폰5";
        P2.productArea = "경기도 평택";
        P2.price = 780000;
        P2.tax = 0.7;

        Product P3 = new Product();
        P3.productId = "ktsnote3";
        P3.productName = "KT스마트폰3";
        P3.productArea = "서울시 강남";
        P3.price = 250000;
        P3.tax = 0.3;

        System.out.println(P1.information());
        System.out.println(P2.information());
        System.out.println(P3.information());
        System.out.println("___________________________________________________________________");
        System.out.println();
        P1.ProductArea();
        P2.ProductArea();
        P3.ProductArea();
        System.out.println("___________________________________________________________________");
        System.out.println();
        P1.setPrice(120000);
        P2.setPrice(120000);
        P3.setPrice(120000);
        P1.setTax(0.5);
        P2.setTax(0.5);
        P3.setTax(0.5);

        System.out.println("상품명: "  + P1.ProductName());
        System.out.println("가격: " + (int)(P1.Price() + P1.Price() * P1.Tax()));
        System.out.println("상품명: "  + P2.ProductName());
        System.out.println("가격: " + (int) (P2.Price() + P2.Price() * P2.Tax()));
        System.out.println("상품명: "  + P3.ProductName());
        System.out.println("가격: " + (int)(P3.Price() + P3.Price() * P3.Tax()));
    }
}
