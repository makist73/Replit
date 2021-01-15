package Replit.jan13;

import java.util.Locale;
import java.util.Scanner;

public class Email_2_077 {

    /*
    Write a program that will print out information about user based on email. Print first and last name from the upper case.

Example:
Input: craig_federighi@apple.com
Output:
First name: Craig
Last name: Federighi
Domain: apple
Top-Level Domain: com
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();
        
        String firstName= email.substring(0,email.indexOf('_'));
        String lastName= email.substring(email.indexOf('_')+1 ,email.indexOf('@'));
        String domain =  email.substring(email.indexOf('@')+1,email.indexOf('.'));
        String topLevelDomain=email.substring(email.indexOf('.')+1,email.length());

        System.out.print( "First name: "+firstName.toUpperCase().charAt(0)+firstName.substring(1,firstName.length())+
                            "\nLast name: " +lastName.toUpperCase().charAt(0)+lastName.substring(1,lastName.length())+
                            "\nDomain: "   +domain  +
                            "\nTop-Level Domain: " + topLevelDomain );


    }
}
