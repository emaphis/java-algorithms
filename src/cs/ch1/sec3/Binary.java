/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.3 - Conditionals and loops
 * Program 1.3.7 - Binary.java
 *
 * Description: Converting to binary.
 * Exercise: This program takes a positive integer n as a command-line
 *           argument and prints the binary representation of n, by casting
 *           out powers of 2 in decreasing order (see text).
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * Print the binary representation of n.
 * @author emaphis
 */
public class Binary
{
    public static void main(String[] args)
    {
        int n = Integer.parseInt(args[0]); // integer to convert
        int power = 1;                     // current power of 2.
        while (power <= n/2)
            power *= 2;
        // Now power is the largest power of 2 <= n.

        while (power > 0)
        {   /// Cast out powers of2 in decreasing order.
            if (n < power) { System.out.print(0); }
            else           { System.out.print(1);
                             n -= power; }
            power /= 2;
        }
        System.out.println();
    }
}
