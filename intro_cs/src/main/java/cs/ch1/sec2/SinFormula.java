/******************************************************************************
 *  Compilation:  javac SinFormula.java
 *  Execution:    java SinFormula double
 *
 *  Author:  Ed Maphis
 *  Section: 1.2 - Built-in Types of Data
 *  Program: 1.2.21 - SinFormula.java
 *
 *  Description: Calculates a given formula.
 *  Exercise: Write a program that takes a double command-line argument t
 *            and prints the value of sin(2t) + sin(3t).
 ******************************************************************************/

package cs.ch1.sec2;

public class SinFormula {

    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double ret = Math.sin(2.0 * t) + Math.sin(3.0 * t);
        System.out.println(ret);
    }

}
