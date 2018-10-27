/******************************************************************************
 *  Compilation:  javac Ruler.java
 *  Execution:    java Ruler int
 *
 *  Author:  Ed Maphis
 *
 *  Section: 1.2 - Built-in Types of Data
 *  Program: 1.2.1 - Ruler.java
 *
 *  Description: String concatenation
 *  Formula: This program prints the relative lengths of the subdivisions on
 *           a ruler. The nth line of output is the relative lengths of the
 *           marks on a ruler subdivided in intervals of 1/2 n of an inch.
 *           For example, the fourth line of output gives the relative lengths
 *           of the marks that indicate intervals of one-sixteenth of an inch
 *           on a ruler.
 ******************************************************************************/

package cs.ch1.sec2;

public class Ruler {
    public static void main(String[] args) {
        String ruler1 = "1";
        String ruler2 = ruler1 + "2" + ruler1;
        String ruler3 = ruler2 + "3" + ruler2;
        String ruler4 = ruler3 + "4" + ruler3;
        System.out.println(ruler1);
        System.out.println(ruler2);
        System.out.println(ruler3);
        System.out.println(ruler4);
    }
}
