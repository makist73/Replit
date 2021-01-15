package Replit.jan3;

import java.util.Scanner;

public class VendingMachine_034 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int itemPrice, change ;
        int quarters, dimes, nickels;
        System.out.println("Enter price in cents:");
        itemPrice=scan.nextInt();

        if (itemPrice <25 || itemPrice >100 || itemPrice %5 !=0) {
            System.out.println( "Invalid price!");
        }else{
            change = 100 -itemPrice;
            quarters=change /25;
            int remainingCentsAfterQuarter= change % 25;
            dimes = remainingCentsAfterQuarter/10;
            int remainingCentsAfterDimes=remainingCentsAfterQuarter%10 ;
            nickels=remainingCentsAfterDimes/5;
            System.out.println("Your change is "+quarters+ " quarters, "+ dimes+ " dimes, and "  +nickels +" nickels.");
        }

    }
}