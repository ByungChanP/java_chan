package team.Store;

public class Product {
    String productId;     // 상품 아이디
    String productName;   // 상품명
    String productArea;   // 생산지역
    int price;            // 가격
    double tax;           // 세금

    void ProductIds() {
        System.out.println(productId);
    }

    String ProductName() {
        return productName;
    }

    void ProductArea() {
        System.out.println(productArea);
    }

    int Price() {
        return price;
    }

    void setPrice(int p) {
        this.price = p;
    }

    double Tax() {
        return tax;
    }

    void setTax(double tax) {
        this.tax = tax;
    }

    String information() {
        return productId + " " +
                productName + " " +
                productArea + " " +
                price + " " +
                tax;
    }
}
