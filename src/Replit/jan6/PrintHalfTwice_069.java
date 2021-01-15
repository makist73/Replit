package Replit.jan6;

import java.util.Scanner;

public class PrintHalfTwice_069 {
    //Write a program that will print out first half of the word twice
    //Example:
    //input: java
    //output: jaja

    public static void main(String[] args) {
        System.out.println("write a word");
        Scanner scan = new Scanner(System.in);
        String word =scan.next();
        String output = word.substring(0,(word.length()/2));

        System.out.println(output+output);

    }
}
