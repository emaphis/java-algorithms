/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.3 - Conditionals and loops
 * Program 1.3.1x - DivisorPattern.java
 *
 * Description: Your first nested loop.
 * Exercise: This program takes an integer command-line argument n and uses
 *           nested for loops to print an n-by-n table with an asterisk in
 *           row i and column j if either i divides j or j divides i.
 *           The loop control variables i and j control the computation.
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * @author emaphis
 *
 */
public class DivisorPattern {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Print a square that visualizes divsors.
        int n = Integer.parseInt(args[0]);
        for (int i = 1; i <= n; i++)
        {   // Print the ith line.
            for (int j = 1; j <= n; j++)
            {   // Print the jth element in the ith line.
                if ((i % j == 0) || (j % i == 0))
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(i);
        }
    }

}
