/******************************************************************************
 *  Compilation:  javac OrderCheck.java
 *  Execution:    java OrderCheck int int int
 *
 *  Author: Ed Maphis
 *  Section: 1.2 - Built-in Types of Data
 *  Program: 1.2.28 - OrderCheck.java
 *
 *  Description: Check order of inputs.
 *  Exercise: Write a program that takes three double command-line arguments
 *            x, y, and z and prints true if the values are strictly ascending
 *            or descending ( x < y < z or x > y > z ), and false otherwise.
 ******************************************************************************/

package cs.ch1.sec2;

/**
 * @author emaphis
 *
 */
public class OrderCheck {

    /**
     * @param args
     * takes three arguments from command line
     */
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int z = Integer.parseInt(args[2]);

        boolean ret = (x < y && y < z) || (x > y && y > z);
        System.out.println(ret);
    }

}
