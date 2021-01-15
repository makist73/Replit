package Replit.jan6;

import java.util.Scanner;

public class StringCharAt {
// using charAt method output the 3rd letter of txt string then the 5th letter then the 6th letter.
//use print not println.
    public static void main(String[] args) {
        System.out.println("enter text");
        Scanner s =new Scanner(System.in);
        String text= s.next();

        char letter3=text.charAt(2);
        char letter5=text.charAt(4);
        char letter6=text.charAt(5);

        System.out.print(""+letter3+letter5+letter6);

    }
}
