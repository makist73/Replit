package Replit.jan6;

import java.util.Scanner;

public class ConditionalStatementPractice3_048 {
/*
 The variable "name" holds a String user input

Write a conditional statement starting on line 9 that does the following:
If name is equal to "Chen", print "teacher"
For any other input, print "student"

Examples:
In: Chen
teacher
In: Faa
student
 */
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String name = inp.nextLine();
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        if (name.equals("Chen")){
            System.out.println("teacher");
        }else  {
            System.out.println("student");
        }

    }
}
