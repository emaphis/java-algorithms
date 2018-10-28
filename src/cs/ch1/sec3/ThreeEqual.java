/******************************************************************************
 *  Compilation:  javac ThreeEqual.java
 *  Execution:    java ThreeEqual int int int
 *
 *  Author:  Ed Maphis
 *  Section: 1.3 - Conditionals and loops
 *  Exercise: 1.3.1 - ThreeEqual.java
 *
 *  Description: Test if three inputs are equal.
 *  Exercise:  Write a program that takes three integer command-line arguments
 *             and prints equal if all three are equal, and not equal
 *             otherwise.
 ******************************************************************************/
package cs.ch1.sec3;

/**
 * Test if three inputs are equal.
 * @author emaphis
 *
 */
public class ThreeEqual {

    public static void main(String[] args) {
        // Input three numbers to test
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        // Use if statement for test.
        if (a == b && b == c) System.out.println("equal");
        else                  System.out.println("not equal");
    }

}
