package ch12.car;

public class revenue {
    static int earnings = 0;

    public static int earn(int amount){
        earnings += amount;
        return earnings;
    }
    public static void totalRevenue(int amount){
        earn(amount);
        System.out.println(earnings);
    }
}
