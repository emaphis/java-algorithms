/******************************************************************************
 *  Compilation:  javac RollLoadedDie.java
 *  Execution:    java RollLoadedDie int
 *
 *  Author:  Ed Maphis
 *  Section: 1.3 - Conditionals and loops
 *  Program: 1.3.5 -RollLoadedDie.java
 *
 *  Description: Loaded die simulation.
 *  Exercise: Write a program RollLoadedDie that prints the result of rolling a
 *            loaded die such that the probability of getting a 1, 2, 3, 4,
 *            or 5 is 1/8 and the probability of getting a 6 is 3/8.
 ******************************************************************************/

package cs.ch1.sec3;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Loaded die simulation.
 * @author emaphis
 *
 */
public class RollLoadedDie {

    public static void main(String[] args) {
        double roll = StdRandom.uniform();
        int ret;
        if      (roll < 1.0 / 8.0) ret = 1;
        else if (roll < 2.0 / 8.0) ret = 2;
        else if (roll < 3.0 / 8.0) ret = 3;
        else if (roll < 4.0 / 8.0) ret = 4;
        else if (roll < 5.0 / 8.0) ret = 5;
        else                       ret = 6; // all the rest

        System.out.println(ret);
    }
}
