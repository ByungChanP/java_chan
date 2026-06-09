package team.cafe;

import ch12.car.revenue;

import java.util.Scanner;

public class order {

    public static void main(String[] args){


        // 포함 관계
        orderInfo ord = new orderInfo();


        // 상속 관계
        Employee b = new barista();

        while(true){
            Scanner n = new Scanner(System.in);
            String drink = n.nextLine();
            int num = n.nextInt();

            ord.ord(drink, num);
            System.out.println("----------------------------");
            System.out.println();
            if(drink.equals("아메리카노 아이스")){
                b.work(drink);
            } else if(drink.equals("아메리카노")) {
                b.work();
            } else {
                continue;
            }

            System.out.println("----------------------------");
            System.out.println("2시간이 지난 후");
            b.clean();
            System.out.println("----------------------------");
            System.out.print("총 수익: ") ; revenue.totalRevenue(ord.amount);
            System.out.println();

        }
    }
}
