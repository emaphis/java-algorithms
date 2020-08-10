/******************************************************************************
 *  Compilation:  javac Examples.java
 *  Execution:    java Examples
 *
 *  Author:  Ed Maphis
 *  Section: 1.2 - Built-in Types of Data
 *
 *  Description: Example code
 *  Formula: Examples and experiments
 ******************************************************************************/

package main.java.cs.ch1.sec3;

public class Examples {

    public static void main(String[] args) {

        // Ex. 1.3.3
//        int a = 0;
//        int b = 0;
//        int c = 0;
//        if (a > b) then c = 0;
//        if a > b { c = 0; }
//        if (a > b) c = 0;
//        if (a > b) c = 0 else b = 0;

        // Ex 1.3.4
//        double x = 0.0;
//        double y = 0.0;
//        if (x >= 0.0 && x <= 1.0 && y >= 0.0 && y <= 1.0)
//            System.out.println("true");
//        else
//            System.out.println("false");

        // Ex. 1.3.7
        // int i = 0;
        // int j = 0;
        // for (i = 0, j = 0; i < 10; i++)  j += i;  // i=10 j=45
        // for (i = 0, j = 1; i < 10; i++)  j += j;  // i=10 j=1024
        // for (j = 0; j < 10; j++) j += j;          // i=0 j=15
        // for (i = 0, j = 0; i < 10; i++) j += j++; // i=10 j=0
        // System.out.println("i="+i + " " + "j="+j);

        // Ex. 1.3.13
//        int n = 123456789;
//        int m = 0;
//        while (n != 0) {
//            m = (10 * m) + (n % 10);
//            n = n / 10;
//        }
//        System.out.println("n="+n + " m="+m);


        // Ex. 1.3.14
//        int f = 0, g = 1;
//        for (int i = 0; i <= 15; i++) {
//           System.out.println(f);
//           f = f + g;
//           g = f - g;
//        }

        // Ex. 1.3.18
//        double sum = 0.0;
//        double n = 1000000;
//        double harm = (Math.PI * Math.PI) / 6.0;
//        for (int i = 1; i <= n; i++) {
//            //sum += 1 / (i*i);     // a. no  - div by zero
//            //sum += 1.0 / i*i;     // b. no  - 1000000.0
//            //sum += 1.0 / (i*i);   // c. no  - Infinity
//            sum += 1 / (1.0*i*i); // d. yes - 1.64493306684877
//        }
//        System.out.println(sum + " : " +harm); // 1.6449340668482264

    }
}

