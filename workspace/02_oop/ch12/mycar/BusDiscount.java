package ch12.mycar;

public class BusDiscount {
    // 입력한 나이에 따른 할인율
   public double ageDiscount(int passengerAge){
        double discount = 0;
        if (passengerAge<0){
            System.out.println("숫자를 다시 입력해주세요");
        } else if (passengerAge < 20){
            discount = 0.5;
        } else if (passengerAge <65){
            discount = 0;
        } else {
            discount = 1;
        }
        return discount;
   }
   public double paymentMethodDiscount(String method){
       double discount = 0;
       switch (method) {
           case "현금" -> discount = 0.1;

           case "교통카드" -> discount = 0.0;

           case "지역카드" -> discount = 0.15;

           default -> discount = 0;
       }
        return discount;
   }
   double amountDiscount(int passengerAge, String method){
       double discount = 0;
       discount = ageDiscount(passengerAge) + paymentMethodDiscount(method);
       System.out.println("할인율은 " + discount + " 입니다.");
       return discount;
   }
}
