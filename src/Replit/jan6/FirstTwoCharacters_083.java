package Replit.jan6;

import java.util.Scanner;

public class FirstTwoCharacters_083 {
    /*
    using substring method output the first two letters of txt string
for examole:
String txt = "foo"
the first two letters are "fo"
use print not println.

     */

    public static void main(String[] args) {
        System.out.println("enter a word");
        Scanner s =new Scanner(System.in);
        String txt= s.next().substring(0,2);
        System.out.println(txt);


    }
}
