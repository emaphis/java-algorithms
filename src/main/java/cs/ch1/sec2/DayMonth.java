/******************************************************************************
 *  Compilation:  javac DayMonth.java
 *  Execution:    java DayMonth month dar
 *
 *  Author:  Ed Maphis
 *  Section  1.2 - Built-in Types of Data
 *  Program  1.2.23 - DayMonth.java
 *
 *  Description: Check to see if a given day and month is in a range.
 *  Exercise: Write a program that takes two integer command-line arguments m
 *            and d and prints true if day d of month m is between 3/20 and
 *            6/20, false otherwise.
 ******************************************************************************/

package cs.ch1.sec2;

public class DayMonth {
// TODO : Not sure my logic is right.
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        boolean inRange = (m >= 3 && d >= 20) && (m <= 6);
        System.out.println(inRange);
    }

}
