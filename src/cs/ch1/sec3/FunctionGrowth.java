/******************************************************************************
 *  Compilation:  javac FunctionGrowth.java
 *  Execution:    java FunctionGrowth
 *
 *  Author:  Ed Maphis
 *  Section: 1.3 - Conditionals and loops
 *  Program: 1.3.12 - FunctionGrowth.java
 *
 *  Description: Print a table of functions.
 *  Exercise: Write a program FunctionGrowth that prints a table of the values
 *            log n, n, n*log_e n, n^2, n^3, and 2^n for n = 16, 32, 64, ...,
 *            2,048. Use tabs (\t characters) to align columns.
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * @author emaphis
 *
 */
public class FunctionGrowth {

    public static void main(String[] args) {

        System.out.println("log n \tn \tn log n\tn^2 \tn^3\t2^n");

        for (long n = 2; n <= 2048; n *= 2) {
            long logN   = (long) Math.log(n);
            long nLogEN = n * (long) Math.log(n);
            long np2    = n * n;
            long np3    = n * n * n;
            long pn     = (long) Math.pow(2.0, n);

            System.out.println(logN + "\t" + n + "\t" + nLogEN + "\t" +
                                np2 + "\t" + np3 + "\t" + pn);
        }
    }
}
