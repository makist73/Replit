package Replit;

import java.util.Scanner;

public class HappyValleySchoolSystem_044 {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter age");
        int age= input.nextInt();
        String grade =(age==2)?"toddler":(age>2&&age<6)? "early childhood":
        (age>=6&& age <8)?"young reader":(age>=8 && age<11)? "elementary":
        (age==11||age ==12)? "middle":(age ==13)?"impossible":(age>=14 && age <17)?"high school":
        (age==17||age==18)?"scholar":"ineligible";
        System.out.println(grade);

        /*System.out.println((age==2)?"toddler":(age>2&&age<6)? "early childhood":
       (age>=6&& age <8)?"young reader":(age>=8 && age<11)? "elementry":
       (age==11||age ==12)? "middle":(age ==13)?"impossible":(age>=14 && age <17)?"high school":
               (age==17||age==18)?"scholar":"ineligible");
        */
    }
}
