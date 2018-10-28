/******************************************************************************
 *  Compilation:  javac WindChill.java
 *  Execution:    java WindChill int
 *
 *  Author:  Ed Maphis
 *  Section: 1.3
 *  Program: 1.3.6 - WindChill.java
 *
 *  Description: Calculate the wind chill - improved.
 *  Exercise: Improve your solution to exercise 1.2.25 by adding code to check
 *            that the values of the command-line arguments fall within the
 *            ranges of validity of the formula, and by also adding code to
 *            print out an error message if that is not the case. .
 *            Note : The formula is not valid if T is larger than 50 in
 *            absolute value or if v is larger than 120 or less than 3
 *            (you may assume that the values you get are in that range).
 ******************************************************************************/

package cs.ch1.sec3;

public class WindChill {

    public static void main(String[] args) {
        int t = Integer.parseInt(args[0]);
        int v = Integer.parseInt(args[1]);

        if (t > 50 || v > 120 || v < 3) {
            // Print out error
            System.out.println("Input outside of accurate range.");
        }
        else {
            double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
            System.out.println(w);
        }
    }

}
