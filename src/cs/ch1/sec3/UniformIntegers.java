/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.3 - Conditionals and loops
 * Program 1.3.10 - UniformIntegers.java
 *
 * Description: Print and average uniform integers.
 * Exercise: Write a program that takes an integer command-line argument n,
 *           uses Math.random() to print n uniform random values between
 *           0 and 1, and then prints their average value (see exercise 1.2.30).
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * Print and average uniform integers.
 * @author emaphis
 *
 */
public class UniformIntegers {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < num; i++) {
            double dbl = Math.random();
            System.out.println(i + ": " + dbl);
            sum += dbl;
        }
        double avg = sum/num;
        System.out.println("Avg = " + avg);
    }

}
