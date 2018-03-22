/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Exercise 1.2.14 - EvenlyDivides.java
 *
 * Description: Checks if two passed numbers evenly divide.
 * Formula: Write a program that takes two positive integers as command-line
 *          arguments and prints true if either evenly divides the other.
 ******************************************************************************/


package cs.ch1.sec2;

public class EvenlyDivides {

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        boolean ret = (a % b == 0) || (b % a == 0);
        System.out.println(ret);

    }

}
