/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 - Built-in Types of Data
 * Program 1.2.30 - UniformRandom.java
 *
 * Description: Uniform random numbers. 
 * Exercise: Write a program that prints five uniform random numbers
 *           between 0 and 1, their average value, and their minimum and
 *           maximum values. Use Math.random(), Math.min(), and Math.max(). 
 ******************************************************************************/

package cs.ch1.sec2;

/**
 * @author emaphis
 *
 */
public class UniformRandom {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Double rn1 = Math.random();
        Double rn2 = Math.random();
        Double rn3 = Math.random();
        Double rn4 = Math.random();
        Double rn5 = Math.random();

        double min = Math.min(rn1, Math.min(rn2, Math.min(rn3, Math.min(rn4, rn5))));
        double max = Math.max(rn1, Math.max(rn2, Math.max(rn3, Math.max(rn4, rn5))));
        double ave = (rn1 + rn2 + rn3 + rn4 + rn5) / 5.0;

        System.out.println("Ran1 " + rn1);
        System.out.println("Ran2 " + rn2);
        System.out.println("Ran3 " + rn3);
        System.out.println("Ran4 " + rn4);
        System.out.println("Ran5 " + rn5);
        System.out.println("Min " + min);
        System.out.println("Max " + max);
        System.out.println("Avg " + ave);
    }

}
