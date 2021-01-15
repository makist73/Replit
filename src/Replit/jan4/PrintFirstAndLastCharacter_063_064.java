package Replit.jan4;
import java.util.*;
public class PrintFirstAndLastCharacter_063_064 {

    public static void main(String[] args) {

        System.out.println("Enter your word: ");
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        char firstChar= word.charAt(0);
        System.out.println(firstChar);
//========================================================================

        char lastChar= word.charAt(word.length()-1);
        System.out.println(lastChar);


    }
}
