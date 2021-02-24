/******************************************************************************
 *  Compilation:  javac PowersOfTwo.java
 *  Execution:    java PowersOfTwo long
 *
 *  Author:  Ed Maphis
 *  Section: 1.3 - Conditionals and loops
 *  Program: 1.3.16 - PowersOfTwo.java
 *
 *  Description: Prints powers of 2 upto a given number.
 *  Exercise: Write a program that takes an integer command-line argument n and
 *            prints all the positive powers of 2 less than or equal to n.
 *            Make sure that your program works properly for all values of n.
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * Prints powers of 2 upto a given number.
 * @author emaphis
 *
 */
public class PowersOfTwo {

    public static void main(String[] args) {
        long num = Long.parseLong(args[0]);

        long pow = 1L;
        for (long i = 0L; i < num; i++) {
            pow *= 2L;
            System.out.print(pow + " ");
        }
        System.out.println();
    }

}
