/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2
 * Program 1.2.5
 *
 * Description: Program that calculates random intgers.
 * Formula: Uses the Java method Math.random() to generate random numbers 
 ******************************************************************************/

package cs.ch1.sec2;

public class RandomInt {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double r = Math.random();   // uniform between 0.0 and 1.0
        int value = (int) (r * n);  // uniform between 0 and n-1
        System.out.println(value);
    }

}
