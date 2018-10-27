/******************************************************************************
 *  Compilation:  javac RollDice.java
 *  Execution:    java RollDice
 *
 *  Author:  Ed Maphis
 *  Section 1.2 - Built-in Types of Data
 *  Program 1.2.20 - RollDice.java
 *
 *  Description: Simulates the roll of two dice.
 *  Exercise: Write a program that prints the sum of two random integers between
 *            1 and 6 (such as you might get when rolling dice).
 ******************************************************************************/

package cs.ch1.sec2;

import edu.princeton.cs.algs4.StdRandom;

public class RollDice {

    public static void main(String[] args) {
        int roll1 = (int) (StdRandom.uniform() * 6) + 1;  // 0->5 + 1
        int roll2 = (int) (StdRandom.uniform() * 6) + 1;
        System.out.println(roll1 + roll2); // 2 -> 12
    }

}
