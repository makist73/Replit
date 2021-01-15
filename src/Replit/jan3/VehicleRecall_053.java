package Replit.jan3;

import java.util.Scanner;

public class VehicleRecall_053 {

    public static void main(String[] args) {

        //WRITE YOUR CODE HERE

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter vehicle's year:");
        int vehicleYear = scan.nextInt();
        //1995-1998, ||  2001-2002, ||  2004-2006 || 2015-2017
        if (vehicleYear >= 1995 && vehicleYear <= 1998 ||
                vehicleYear >= 2001 && vehicleYear <= 2002 ||
                vehicleYear >= 2004 && vehicleYear <= 2006 ||
                vehicleYear >= 2015 && vehicleYear <= 2017) {
            System.out.println("Your vehicle needs to be recalled!");
        } else {
            System.out.println("Your vehicle is fine, enjoy!");
        }
    }
}