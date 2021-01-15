package Replit.before_Aug;

import java.util.Scanner;

public class IfStatement_BurgerOrChicken {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter your order");
        String in= s.next();

        if(in.equals("burger")  || in.equals("chicken") ){
            System.out.println("10.0");

        }if (in.equals("soda") ){
            System.out.println("2.0");
        }

    }
}
