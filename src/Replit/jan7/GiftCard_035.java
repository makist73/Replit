package Replit.jan7;

import java.util.Scanner;

public class GiftCard_035 {
    /*
    Let's say I've got a 100$ gift card and you want to buy something in your online store . Write a program that will help me to buy something and display leftover balance after purchase. If item is not in the list, display message: "Invalid item!". If price is more than 100$, display message: "Sorry, not enough funds on your gift card!".
    Hint
    Use if/ else if / else
    CODE EXAMPLE:
    Example #1
    input: Hat
    output: Thank you for your purchase!
    output: Your current balance is: 75$

    Example #2
    input: Pants
    output: Thank you for your purchase!
    output: Your current balance is: 50$

    Example #3
    input: Laptop
    output: Sorry, not enough funds on your gift card!

    Example #4
    input: Cupcake
    output: Invalid item!
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your item");
        String item = scan.nextLine();


        int giftCard = 100;

        int  smartphone = 300;
        int laptop = 400;
        int charger = 15;
        int usbCable = 10;
        int headphones = 30;
        int pants = 50;
        int hat = 25;
        int socks = 5;
        int blanket = 60;
        int pillow = 40;


        if (item.equalsIgnoreCase("smartphone")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("laptop")) {
            System.out.println("Sorry, not enough funds on your gift card!");
        } else if (item.equalsIgnoreCase("charger")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - charger)+"$");
        } else if (item.equalsIgnoreCase("USB cable")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - usbCable)+"$");
        } else if (item.equalsIgnoreCase("headphones")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - headphones)+"$");
        } else if (item.equalsIgnoreCase("pants")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - pants)+"$");
        } else if (item.equalsIgnoreCase("hat")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - hat)+"$");
        } else if (item.equalsIgnoreCase("socks")) {
        System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - socks)+"$");
        } else if (item.equalsIgnoreCase("blanket")) {
        System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - blanket)+"$");
        }else if (item.equalsIgnoreCase("pillow")) {
            System.out.println("Thank you for your purchase!\nYour current balance is: " + (giftCard - pillow)+"$");
        }else{
            System.out.println("Invalid item!");

        }
    }
}