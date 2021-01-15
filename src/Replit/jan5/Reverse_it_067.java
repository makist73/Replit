package Replit.jan5;
import java.util.Scanner;
import java.util.SortedMap;

public class Reverse_it_067 {

    /*
    Write a program that will reverse a string.
    Your program should reverse a string only 5 characters long.
    If word is shorter, display message: "Too short!".
    If word is longer, display message: "Too long!".
    Otherwise, reverse this word and print out result into the console.

            Example:
        input: cat
        output: Too short!

        Example:
        input: singularity
        output: Too long!

        Example:
        input: apple
        output: elppa

     */

    public static void main(String[] args) {
        System.out.println("Enter a word: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        String output ="";

        int i=word.length()-1;
        while (i>=0){
            output += word.charAt(i);
            i--;

        }

        if(word.length()==5){
            System.out.println(output);

        }else if (word.length()<5){
            System.out.println("Too short!");
        }else{
            System.out.println("Too long!");
        }

    }

}
