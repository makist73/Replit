package Replit.jan6;
import java.util.Scanner;

public class MergeThem_066 {
    /*
    You have 2 words, both of them have 3 characters.
If either of them does not have exactly 3 characters, print "cannot merge"
Merge their characters one by one and print together like below:

aok
lol
alookl

ear
pie
epaire

java
wow
cannot merge

hint:
by inserting +""+ (empty string) between chars, you can concatenate char values.
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();  // aok
        String word2 = scan.next();  //lol
        //YOUR CODE HERE

        if(word1.length()==3 && word2.length()==3) {
            for (int i = 0; i < 3; i++) {
                String output1 = "" + word1.charAt(i);
                String output2 = "" + word2.charAt(i);
                System.out.print(output1 + output2);
            }
        }else {
                System.out.println( "cannot merge");
            }

        }


}
