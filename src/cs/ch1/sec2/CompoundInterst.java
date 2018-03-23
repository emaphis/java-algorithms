/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Program 1.2.24 - CompoundInterest.java
 *
 * Description: Calculate compound interest.
 * Exercise: Continuously compounded interest.
 *           Write a program that calculates and prints the amount of
 *           money you would have after t years if you invested P dollars
 *           at an annual interest rate r (compounded continuously).
 *           The desired value is given by the formula P * e^(rt). 
 ******************************************************************************/

package cs.ch1.sec2;

public class CompoundInterst {

    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]); // Time Years
        double p = Double.parseDouble(args[1]); // Principle
        double r = Double.parseDouble(args[2]); // Interest
        double money = p * Math.exp(r * t);
        System.out.println(money);
    }

}
