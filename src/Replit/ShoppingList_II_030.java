package Replit;

import java.util.Scanner;

public class ShoppingList_II_030 {
    public static void main(String[] args) {

      /*  Scanner scan= new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1= scan.next();
        int count1=scan.nextInt();
        double price1=scan.nextDouble();
        String report1="Item1 is "+"\""+item1+"\""+", count is "+count1+", price is "+price1;
        System.out.println(report1);

        System.out.println("Enter Item2, count and its price: ");
        String item2= scan.next();
        int count2=scan.nextInt();
        double price2=scan.nextDouble();
        String report2="Item2 is "+"\""+item2+"\""+", count is "+count2+", price is "+price2;
        System.out.println(report2);
        System.out.println("Enter Item3, count and its price:");
        String item3= scan.next();
        int count3=scan.nextInt();
        double price3=scan.nextDouble();
        String report3="Item3 is "+"\""+item3+"\""+", count is "+count3+", price is "+price3;
        System.out.println(report3);

        double totalPrice=(count1*price1)+(count2*price2)+(count3*price3);


        if (count2==0){
       System.out.println("Item1: "+item1+" Price: "+(count1*price1)+", Item3: "+item3+" Price: "+(count3*price3));
            System.out.println("Item2 "+"\""+item2+"\""+" is not included since its count is 0");
            System.out.println("Total price: "+totalPrice);
        }else if(count3==0){
            System.out.println("Item1: "+item1+" Price: "+(count1*price1)+", Item2: "+item2+" Price: "+(count2*price2));
            System.out.println("Item3 "+"\""+item3+"\""+" is not included since its count is 0");
            System.out.println("Total price: "+totalPrice);
        }else{
            System.out.println("Total price: "+totalPrice);
        }

       */


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Item1, count and its price:");
        String item1 = scan.next();
        int count1 = scan.nextInt();
        double price1 = scan.nextDouble();

        System.out.println("Enter Item2, count and its price:");
        String item2 = scan.next();
        int count2 = scan.nextInt();
        double price2 = scan.nextDouble();

        System.out.println("Enter Item3, count and its price:");
        String item3 = scan.next();
        int count3 = scan.nextInt();
        double price3 = scan.nextDouble();

        double totalPrice = (count1 * price1) + (count2 * price2) + (count3 * price3);

        if (count2 == 0) {
            System.out.println("Item1: " + item1 + " Price: " + (count1 * price1) + ", Item3: " + item3 + " Price: " + (count3 * price3));
            System.out.println("Total price: " + totalPrice);
        } else if (count3 == 0) {
            System.out.println("Item1: " + item1 + " Price: " + (count1 * price1) + ", Item2: " + item2 + " Price: " + (count2 * price2));
            System.out.println("Total price: " + totalPrice);
        } else {
            System.out.println("Total price: " + totalPrice);
        }

    }
}
