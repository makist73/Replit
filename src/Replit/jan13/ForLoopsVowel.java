package Replit.jan13;

import java.util.Scanner;

public class ForLoopsVowel {

    /*
    Inputs:
String word;

Write a for loop that will loop through every letter of the input and print out just the vowels. Sample input/outputs


In: huehuehuehue
ueueueue

In: poopoo what idk what im doing
ooooaiaioi
     */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for (int j = 0; j < word.length(); j++) {
            char output = word.charAt(j);
            if (output== 'a' || output == 'e'||output == 'i'||output == 'o'||output == 'u') {

                System.out.print(output);

            }
        }
    }
}


