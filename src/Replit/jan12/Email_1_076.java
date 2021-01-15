package Replit.jan12;

import java.util.Scanner;

public class Email_1_076 {

    /*
    In this task, you need to swap first name with last name in the email.
    If email doesn't contains underscore - do not anything.

        Example:
        input: mike_tyson@gmail.com
        output: tyson_mike@gmail.com

        Example:
        input: barakobama@gmail.com
        output: barakobama@gmail.com
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String email = scan.nextLine();

        if (email.contains("_")) {
        String firstName = email.substring(0, email.indexOf('_'));
        String lastname = email.substring((email.indexOf('_') + 1), (email.indexOf('@')));
        String emailAddress = email.substring((email.indexOf('@')), (email.length()));
            System.out.println(lastname + "_" + firstName + emailAddress);
        } else {
            System.out.println(email);
        }
    }
}