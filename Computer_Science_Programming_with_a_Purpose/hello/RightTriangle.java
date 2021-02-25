/* *****************************************************************************
 *  Name:              Ed Maphis
 *  Coursera User ID:  123456
 *  Last modified:     February 24, 2021
 **************************************************************************** */

public class RightTriangle {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean b1 = a > 0 && b > 0 && c > 0;
        boolean b2 = (a * a + b * b == c * c) ||
                (a * a + c * c == b * b) ||
                (b * b + c * c == a * a);

        System.out.println(b1 && b2);
    }
}
