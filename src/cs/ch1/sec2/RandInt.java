/******************************************************************************
 *  Compilation:  javac RandInt.java
 *  Execution:    java RandInt int int
 *
 *  Author:  Ed Maphis
 *  Section: 1.2 - Built-in Types of Data
 *  Program: 1.2.19 - RandInt.java
 *
 *  Description: Generate a random integer.
 *  Exercise:  Write a program that takes two integer command-line arguments
 *             a and b and prints a random integer between a and b, inclusive.
 ******************************************************************************/

package cs.ch1.sec2;

import edu.princeton.cs.algs4.StdRandom;

public class RandInt {

    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        int random = (int) (StdRandom.uniform() * max) + min;
        System.out.println(random);
    }

}
