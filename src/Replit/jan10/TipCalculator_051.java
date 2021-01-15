package Replit.jan10;

import javax.swing.*;
import java.util.Scanner;

public class TipCalculator_051 {
/*
Write your code inside the method.
Use the values given as method parameters.
Assign final values.
Then user should select service quality that will correspond to tip percent.
Poor = 5%
Fair = 10%
Good = 15%
Great = 20%
Excellent = 25%
The program should display the following information based on the user input:
Split or No split
Number of people entered: &&&&
Service Quality:
Total to pay:
Total tip:
Total per person:
Tip per person:
https://itunes.apple.com/us/app/ihandy-tip-calculator/id324501526?mt=8

Input:
Split:Yes
Number of people:4
Check amount:476.0
Service Quality:Excellent

Output:

Number of people entered: &&&&
Total to pay: 595.0
Total tip: 119.0
Total per person: 148.75
Tip per person: 29.75
 */


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Split:");
        String split = scan.next();
        System.out.println("Number of people:");
        int numOfPeople = scan.nextInt();
        System.out.println("Check amount:");
        double checkAmount = scan.nextDouble();
        System.out.println("Service Quality:");
        String serviceQuality = scan.next();


        double poor = 0.05, fair = 0.10, good = 0.15, great = 0.20, excellent = 0.25;
        double tip = serviceQuality.equalsIgnoreCase("poor") ? checkAmount * poor :
                serviceQuality.equalsIgnoreCase("fair") ? checkAmount * fair :
                        serviceQuality.equalsIgnoreCase("good") ? checkAmount * good :
                                serviceQuality.equalsIgnoreCase("great") ? checkAmount * great :
                                        serviceQuality.equalsIgnoreCase("excellent") ? checkAmount * excellent :
                                                checkAmount;


        double totalToPay = checkAmount + tip;
        double totalPP = totalToPay / numOfPeople;
        double tipPP = tip / numOfPeople;

        char numOfPpl = '&';
        for (int i = 0; numOfPeople > i; i++) {
            numOfPpl++;}

            System.out.println("Number of people entered: " + numOfPpl);

            // numOfPpl++;
            // System.out.println("Number of people entered: "+numOfPpl);
            if (split.equalsIgnoreCase("yes")) {
                System.out.println("Total to pay: " + totalToPay
                        + "\nTotal tip: " + tip + "\nTotal per person: " + totalPP + "\nTip per person: " + tipPP);
            } else {
                System.out.println("Total to pay: " + totalToPay
                        + "\nTotal tip: " + tip);
            }

        /*
        if( split.equalsIgnoreCase("yes")) {
            System.out.println("Total to pay: "+totalToPay
                    +"\nTotal tip: "+tip+"\nTotal per person: "+totalPP+"\nTip per person: "+tipPP);
        }else  {
            System.out.println("Total to pay: "+totalToPay
                    +"\nTotal tip: "+tip);
        }

         */
        }
    }
