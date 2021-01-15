package Replit.jan12;

import java.util.Scanner;

public class LoopDrawRectOutline {
//you get a number, write a code that draws a rectangle outline the size of that number.
//each rectangle row is 3 x: xxx
//inner rect row is "x  x"
//
//for example:
//
//n = 2
//
//xxx
//x  x
//x  x
//xxx
//
//
//n=3
//
//xxx
//x  x
//x  x
//x  x
//xxx

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String rectangle="xxx";
        String innerRecRow="x x";

        System.out.println(rectangle);
        for (int i=1; i<=n; i++){
            System.out.println(innerRecRow);
        }
        System.out.println(rectangle);
    }
}
