/******************************************************************************
 *  Compilation:  javac Gambler.java
 *  Execution:    java Gambler $stake $goal #trials
 *
 *  Author:  Ed Maphis
 *  Section 1.3 - Conditionals and loops
 *  Program 1.3.5 - HarmonicNumber.java
 *
 *  Description: Harmonic numbers.
 *  Exercise: This program takes an integer command-line argument n and
 *            computes the value of the nth harmonic number. The value is known
 *            from mathematical analysis to be about ln(n) + 0.57721 for
 *            large n.
 *            Note that ln(1,000,000) + 0.57721 == 14.39272.
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * @author emaphis
 *
 */
public class HarmonicNumber {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Compute the nth hamonic number.
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            // Add the ith term to the sum.S
            sum += 1.0/i;
        }
        System.out.println(sum);
    }
}
