/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.3 - Conditionals and loops
 * Program 1.3.8 - Hellos.java
 *
 * Description: Print n Hello messages.
 * Exercise: Rewrite TenHellos to make a program Hellos that takes the number
 *           of lines to print as a command-line argument. You may assume that
 *           the argument is less than 1000. Hint: Use i % 10 and i % 100 to
 *           determine when to use st, nd, rd, or th for printing the ithS Hello.
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * Print n Hello messages
 * @author emaphis
 *
 */
public class Hellos {

    public static void main(String[] args) {
        int num = Integer.parseInt(args[0]);

        for (int i = 1; i <= num; i++)
        {
            // Exception 11, 12, 13; assume i < 1000
            if (i % 100 >= 11 && i % 100 <= 13)
                                  System.out.println(i + "th Hello");
            else if (i % 10 == 1) System.out.println(i + "st Hello");
            else if (i % 10 == 2) System.out.println(i + "nd Hello");
            else if (i % 10 == 3) System.out.println(i + "rd Hello");
            else                  System.out.println(i + "th Hello");
        }
    }
}
