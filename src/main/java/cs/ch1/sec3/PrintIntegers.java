/******************************************************************************
 *  Compilation:  javac PrintIntegers.java
 *  Execution:    java PrintIntegers int
 *
 *  Author:  Ed Maphis
 * Section: 1.3 - Conditionals and loops
 * Program: 1.3.9 - PrintIntegers.java
 *
 *  Description: Print integers from 1000 to 2000.
 *  Exercise: Write a program that, using one for loop and one if statement,
 *            prints the integers from 1,000 to 2,000 with five integers per
 *            line. Hint: Use the % operation.
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * Print integers from 1000 to 2000.
 * @author emaphis
 *
 */
public class PrintIntegers {

    public static void main(String[] args) {
        for (int i = 1000; i <= 2000; i++) {
            System.out.print(i + " ");
            if ((i+1) % 5 == 0) System.out.println();
        }
    }
}
