package Replit.jan8;

public class StringIndexOf {
 /*
 using indexOf method output the position of b inside txt string.
then output the index of "foo"

use System.out.println() to output each index of requested.
  */

    public static void main(String[] args) {

        String txt = "foo bar";

        int indexOfB= txt.indexOf('b');
        System.out.println(indexOfB);
        int indexOfFoo=txt.indexOf("foo");
        System.out.println(indexOfFoo);
    }
}
