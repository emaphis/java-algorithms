/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Program 1.2.27 - GaussRandom.java
 *
 * Description: Gaussian random numbers.
 * Exercise: Write a program RandomGaussian that prints a random number r
 *          drawn from the Gaussian distribution. One way to do so is to use
 *          the Box–Muller formula r = sin(2 pi v) (-2 ln u)^1/2 where u and v
 *          are real numbers between 0 and 1 generated by the
 *          Math.random() method. 
 ******************************************************************************/

package cs.ch1.sec2;

/**
 * @author emaphis
 *
 */
public class GaussRandom {

    /**
     * @param args
     */
    public static void main(String[] args) {
       double u = Math.random();
       double v = Math.random();
       
       // Box Muller formuala
       double r = Math.sin(2.0 * Math.PI * v) * Math.sqrt(-2.0 * Math.log(u));
       System.out.println(r);
    }

}