package Replit.jan6;

import java.util.Scanner;

public class StringLength {
    //ask the user for his name, capture it on a string using scanner.
    //then output the length of the name string.

    public static void main(String[] args) {

        Scanner scan =new Scanner(System.in);
        System.out.println("enter your name");
        String name =scan.next();
        int output=name.length();
        System.out.println(output);

    }
}
