/******************************************************************************
 *  Compilation:  javac Flip.java
 *  Execution:    java Flip
 *
 *  Author:  Ed Maphis
 *  Section: 1.3 - Conditionals and loops
 *  Program: 1.3.1 - Flip.java
 *
 * Description: Flipping a fair coin.
 * Exercise: This program uses StdRandom.uniform() to simulate a fair coin flip.
 *           Each time you run it, it prints either Heads or Tails. A sequence
 *           of flips will have many of the same properties as a sequence that
 *           you would get by flipping a fair coin, but it is not a truly
 *           random sequence.
 ******************************************************************************/

package cs.ch1.sec3;

import edu.princeton.cs.algs4.StdRandom;

/**
 * @author emaphis
 * @description Simulates a coin flip demonstrating if-else.
 *
 */
public class Flip {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Simulate a fair con flip.
        if (StdRandom.uniform() < 0.5) System.out.println("Heads");
        else                           System.out.println("Tails");

    }

}
