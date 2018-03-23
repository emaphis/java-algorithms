/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Program 1.2.3 - Quadratic.java
 *
 * Description: Quadratic formula
 * Formula: This program prints the roots of the polynomial x^2 + bx + c, using
 *          the quadratic formula. For example, the roots of x2 – 3x + 2 are
 *          1 and 2 since we can factor the equation as (x – 1)(x – 2);
 *          the roots of x2 – x – 1 are th and 1 – th, where th is the golden
 *          ratio; and the roots of x2 + x + 1 are not real numbers.
 ******************************************************************************/

package cs.ch1.sec2;

public class Quadratic {

    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double discriminant = b*b - 4.0*c;
        double d = Math.sqrt(discriminant);
        System.out.println((-b + d) / 2.0);
        System.out.println((-b - d) / 2.0);
    }

}
