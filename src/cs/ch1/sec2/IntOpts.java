/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Program 1.2.2 - IntOpts.java
 *
 * Description: Integer multiplication and division
 * Formula: Arithmetic for integers is built into Java. Most of this code is
 *          devoted to the task of getting the values in and out; the actual
 *          arithmetic is in the simple statements in the middle of the
 *          program that assign values to p, q, and r.
 ******************************************************************************/

package cs.ch1.sec2;

public class IntOpts {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int p = a * b;
        int q = a / b;
        int r = a % b;
        System.out.println(a + " * " + b + " = " + p);
        System.out.println(a + " / " + b + " = " + q);
        System.out.println(a + " % " + b + " = " + r);
        System.out.println(a + " = " + q + " * " + b + " + " + r);
    }

}
