/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.3 - Conditionals and loops
 * Program 1.3.9 - Factors.java
 *
 * Description: Factoring integers.
 * Exercise: This program takes a positive integer n as a command-line argument
 *           and prints the prime factorization of n. The code is simple, but
 *           it takes some thought to convince yourself that it is correct
 *           (see text).
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * Factoring integers.
 * @author emaphis
 *
 */
public class Factors
{
    public static void main(String[] args)
    {   // Print the prime factorization of n.
        long n = Long.parseLong(args[0]);
        for (long factor = 2; factor <= n/factor; factor++)
        {   // Test potential factor.
            while (n % factor == 0)
            {   // Cast out and print factor.
                n /= factor;
                System.out.print(factor + " ");
            }
        }
        // Any factor of n must be greater than factor.
        if (n > 1) System.out.print(n);
        System.out.println();
    }

}
