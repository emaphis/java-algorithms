/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.3 - Conditionals and loops
 * Program 1.3.1x - zzz.java
 *
 * Description: xxxx.
 * Exercise:
 * Formula:
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * @author emaphis
 *
 */
public class Kary {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
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
