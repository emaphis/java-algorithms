/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Program 1.2.18 - Euclidean.java
 *
 * Description: Calculate the Euclidean distance.
 * Exercise: Write a program that takes two integer command-linearguments x and y
 *        and prints the Euclidean distance from the point (x, y)
 *        to the origin (0, 0).
 ******************************************************************************/

package cs.ch1.sec2;

public class Euclidean {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double d = Math.sqrt(x * x + y * y);
        System.out.println(d);
    }

}
