/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2
 * Program 1.2.4
 *
 * Description: Program that calculates whether an integer corresponds to
 *              leap year.
 * Formula: A year is leap year if it is divisible by 4 (2004), unless it is
 *          divisible by 100 in which case is is not (1900), unless it is
 *          divisible by 400 in which case it is (2000).
 ******************************************************************************/

package cs.ch1.sec2;

public class LeapYear {

    public static void main(String[] args) {
        int year = Integer.parseInt(args[0]);
        boolean isLeapYear;
        isLeapYear = (year % 4 == 0);
        isLeapYear = isLeapYear && (year % 100 != 0);
        isLeapYear = isLeapYear || (year % 400 == 0);
        System.out.println(isLeapYear);
    }

}
