/******************************************************************************
 *  Compilation:  javac Gambler.java
 *  Execution:    java Gambler $stake $goal #trials
 *
 *  Author:  Ed Maphis
 *  Section: 1.3 - Conditionals and loops
 *  Program: 1.3.8 - Gambler.java
 *
 *  Description: Gambler’s ruin simulation.
 *  Exercise: This program takes three integers command-line arguments stake,
 *            goal, and trials. The inner while loop in this program simulates
 *            a gambler with $stake who makes a series of $1 bets, continuing
 *            until going broke or reaching $goal. The running time of this
 *            program is proportional to trials times the average number of
 *            bets. For example, the third command below causes nearly
 *            100 million random numbers to be generated.
 ******************************************************************************/

package cs.ch1.sec3;

import edu.princeton.cs.algs4.StdRandom;

/**
 * Gambler’s ruin simulation
 *
 * @author emaphis
 *
 */
public class Gambler {
    public static void main(String[] args) {
        // Run trials experiments that start with
        // $stake and terminate on $0 or $goal
        int stake = Integer.parseInt(args[0]);
        int goal = Integer.parseInt(args[1]);
        int trials = Integer.parseInt(args[2]);
        int bets = 0;
        int wins = 0;
        for (int t = 0; t < trials; t++) {
            // Run one experiment.
            int cash = stake;
            while (cash > 0 && cash < goal) {
                // Simulate one bet.
                bets++;
                if (StdRandom.uniform() < 0.5)
                    cash++;
                else
                    cash--;
            } // Cash is either 0 (ruin) or &goal (win).
            if (cash == goal)
                wins++;
        }
        System.out.println(100 * wins / trials + "% wins");
        System.out.println("Avg # bets:" + bets / trials);
    }

}
