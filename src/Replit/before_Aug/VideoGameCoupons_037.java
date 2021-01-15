package Replit.before_Aug;

import java.util.Scanner;

public class VideoGameCoupons_037 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter number of coupons:");
        int coupons= scan.nextInt();
        int candy=coupons/10;
        int remainingCoupon=coupons%10;
        int gumball=remainingCoupon/3;

        if(coupons >=3){
            System.out.println("Number of Candies: "+candy);
            System.out.println("Number of Gumballs: "+gumball);

        }else {
        System.out.println("Not enough coupons");
    }

    }
}
