/******************************************************************************
 *  Compilation:  javac Velocity.java
 *  Execution:    java Velocity double double double
 *
 *  Author:  Ed Maphis
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Program 1.2.22 - Velocity.java
 *
 * Description: Calculate the given velocity.
 * Exercise: Write a program that takes three double command-line arguments x0,
 *           v0, and t and prints the value of x0 + v0*t − g*t^2 / 2, where g is
 *           the constant 9.80665. (Note : This value is the displacement in
 *           meters after t seconds when an object is thrown straight up from
 *           initial position x0 at velocity v0 meters per second.)
 ******************************************************************************/

package cs.ch1.sec2;

public class Velocity {

    public static void main(String[] args) {
        double x0 = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double t  = Double.parseDouble(args[2]);
        double G  = 9.80665;
        double velocity = x0 + (v0*t) - (G*t*t) / 2;
        System.out.println(velocity);
    }

}
