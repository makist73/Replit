package Replit;

import java.util.Scanner;

public class Citizens_036 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens =scan.nextInt();
        int nonSeniorCitizen = scan.nextInt();
        System.out.println("What is new citizen's age?");
        int age = scan.nextInt();

        if(age>=65){
            System.out.println("Senior Citizen");
            System.out.println("New seniorCitizens count " +(seniorCitizens+1));
            System.out.println("New nonSeniorCitizens count "+nonSeniorCitizen);
        }else{
            System.out.println("Non-Senior Citizen");
            System.out.println("New seniorCitizens count " +seniorCitizens);
            System.out.println("New nonSeniorCitizens count "+(nonSeniorCitizen+1));
        }
    }
}
