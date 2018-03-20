/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2
 * Program 1.2.3
 *
 * Description: Program that prints out the quadratic results of two inputs 
 ******************************************************************************/

package cs.ch1.sec2;

public class Quadratic {

    public static void main(String[] args) {
        double b = Double.parseDouble(args[0]);
        double c = Double.parseDouble(args[1]);
        double discriminant = b*b - 4.0*c;
        double d = Math.sqrt(discriminant);
        System.out.println((-b + d) / 2.0);
        System.out.println((-b -d) / 2.0);
    }

}
