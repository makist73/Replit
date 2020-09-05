package Replit;

public class if_Statement_Grades {


    public static void main(String[] args) {
        int grade = 57;

        if(grade>=90){
            System.out.println("excellent");
        }else if(grade >=70){
            System.out.println("good");

        }else if(grade >=60){
            System.out.println("pass");

        }else if(grade <60){
            System.out.println("fail");
        }

    }
}