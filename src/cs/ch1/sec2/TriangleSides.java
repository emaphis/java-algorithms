/******************************************************************************
 *  Compilation:  javac RandomInt.java
 *  Execution:    java RandomInt int
 *
 *  Author:  Ed Maphis
 *  Section: 1.2 - Built-in Types of Data
 *  Program: 1.2.15 - TriangleSides.java
 *
 *  Description: Are three entered numbers sides of a triangle.
 *  Exercise: 1.2.15 Write a program that takes three positive integers as
 *            command-line arguments and prints false if any one of them is
 *            greater than or equal to the sum of the other two and true
 *            otherwise.
 *           (Note : This computation tests whether the three numbers could be
 *                   the lengths of the sides of some triangle.)
 ******************************************************************************/

package cs.ch1.sec2;

public class TriangleSides {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);
        boolean ret = (b + c) > a && (a + c) > b && (a + b) > c;
        System.out.println(ret);
    }

}
