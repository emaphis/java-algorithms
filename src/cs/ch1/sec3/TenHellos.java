/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.3 - Conditionals and loops
 * Program 1.3.2 - TenHellos.java
 *
 * Description: Your first while loop.
 * Exercise: This program uses a while loop for the simple, repetitive task of
 *           printing the output shown below. After the third line, the lines
 *           to be printed differ only in the value of the index counting the
 *           line printed, so we define a variable i to contain that index.
 *           After initializing the value of i to 4, we enter into a while loop
 *           where we use the value of i in the System.out.println() statement
 *           and increment it each time through the loop. After printing 10th
 *           Hello, the value of i becomes 11 and the loop terminates.
 ******************************************************************************/

package cs.ch1.sec3;

/**
 * @author emaphis
 *
 */
public class TenHellos {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // Print 10 Hellos.
        System.out.println("1st Hello");
        System.out.println("2nd Hello");
        System.out.println("3rd Hello");
        int i = 4;
        while (i <= 10)
        {
            System.out.println(i + "th Hello");
            i = i + 1;
        }
    }
}
