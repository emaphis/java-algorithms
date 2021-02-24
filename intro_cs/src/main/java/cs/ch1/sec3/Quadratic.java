/******************************************************************************
 *  Compilation:  javac Hellos.java
 *  Execution:    java Hellos int
 *
 *  Author:  Ed Maphis
 *  Section: 1.3 - Conditionals and loops
 *  Program: 1.3.2 - Quadratic.java
 *
 *  Description: Quadratic formula improved
 *  Exercise:  Write a more general and more robust version of Quadratic
 *             (program 1.2.3) that prints the roots of the polynomial
 *             ax2 + bx + c, prints an appropriate message if the discriminant
 *             is negative, and behaves appropriately (avoiding division
 *             by zero) if a is zero.
 ******************************************************************************/

package cs.ch1.sec3;

public class Quadratic {

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);

        if (a == 0) {
            // Throw error if a = 0
            System.out.println("error: a = 0");
        }
        else {
            double d = Math.sqrt(b*b - 4.0*a*c);
            System.out.println((-b + d) / 2.0*a);
            System.out.println((-b - d) / 2.0*a);
        }
    }
}
