/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Program 1.2.5 - RandomInt.java
 *
 * Description: Casting to get a random integer.
 * Formula: Uses the Java method Math.random() to generate a random number r
 *          between 0.0 (inclusive) and 1.0 (exclusive); then multiplies r by
 *          the command-line argument n to get a random number greater than or
 *          equal to 0 and less than n; then uses a cast to truncate the
 *          result to be an integer value between 0 and n-1. 
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
