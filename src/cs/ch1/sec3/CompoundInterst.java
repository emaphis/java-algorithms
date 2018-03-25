/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.3
 * Program 1.3.17 - CompoundInterest.java
 *
 * Description: Produce compound interest table.
 * Exercise:  Expand your solution to exercise 1.2.24 to print a table giving
 *            the total amount of money you would have after t years for
 *            t = 0 to 25.
 ******************************************************************************/

package cs.ch1.sec3;

public class CompoundInterst {

    public static void main(String[] args) {
        double p = Double.parseDouble(args[0]); // Principle
        double r = Double.parseDouble(args[1]); // Interest

        System.out.println("Yea \t Money");
        for (int t = 0; t <= 25; t++) {
            double money = p * Math.exp(r * t);
            System.out.println(t + " \t " + money);
        }
    }

}
