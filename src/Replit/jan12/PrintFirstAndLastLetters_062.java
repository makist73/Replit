package Replit.jan12;

import java.util.Scanner;

public class PrintFirstAndLastLetters_062 {
//Write a program that will print out first and last letters together.

//adobe
//ae

    public static void main(String[] args) {
        //DO NOT CHANGE
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE

        System.out.println(""+word.charAt(0)+word.charAt(word.length()-1));

    }
}
