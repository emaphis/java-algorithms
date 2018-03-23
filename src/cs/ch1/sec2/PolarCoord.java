/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Program 1.2.26 - WindChill.java
 *
 * Description: Polar coorinates.
 * Exercise: Write a program that converts from Cartesian to polar coordinates.
 *           Your program should accept two double commandline arguments x and
 *           y and print the polar coordinates r and Theta. Use the method
 *           Math.atan2(y, x) to compute the arctangent value of y/x that is
 *           in the range from -pi to pi. 
 ******************************************************************************/

package cs.ch1.sec2;

public class PolarCoord {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double r = Math.sqrt(x * x + y * y);
        double th = Math.atan2(y, x);
        System.out.println("Angle = " + th + " " + "Radius = "+ r);
    }

}
