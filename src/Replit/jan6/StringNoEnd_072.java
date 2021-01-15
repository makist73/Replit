package Replit.jan6;

import java.util.Scanner;

public class StringNoEnd_072 {
/*
in this exercise you get a string called txt .

output txt without its last letter.
for example:
txt = "foo"
output will be:
fo
hint
use substring() and length() togather to solve this.
substring will start at 0 and will end at txt length -1
 */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String txt = s.next();
        //your code here

        String output= txt.substring(0,txt.length()-1);
        System.out.println(output);

    }
}
