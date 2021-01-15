package Replit.jan5;

import java.util.Scanner;

public class Duplicate_It_065 {
    /*
    You have 2 words
Print the first word, second word, second word, first word

Input:
one
two
Output:
onetwotwoone

     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        System.out.print(word1+word2+word2+word1);
    }
}
