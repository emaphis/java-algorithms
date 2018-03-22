/******************************************************************************
 * Name:  Ed Maphis
 * Section 1.2 -  Built-in Types of Data
 * Program 1.2.4 - Experiments.java
 *
 * Description:  Exercise experiments.
 * Formula: A program for exercise experiments.
 *  
 ******************************************************************************/

package cs.ch1.sec2;

public class Experiments {

    public static void main(String[] args) {
        // Ex 1.2.1
//        int a = 2;
//        int b = 5;
//        int t = a;
//        b = t;
//        a = b; // a=b=t=2
//        System.out.println("a=" + a + " b=" + b + " t=" + t);
        // Ex 1.2.3
//        boolean bool1 = (!(a < b) && !(a > b)); // false
//        System.out.println(bool1);

        // Ex. 1.2.7
//            System.out.println(2 + "bc");
//            System.out.println(2 + 3 + "bc");
//            System.out.println((2+3) + "bc");
//            System.out.println("bc" + (2+3));
//            System.out.println("bc" + 2 + 3);

        // Ex. 1.2.9
//        System.out.println('b');
//        System.out.println('b' + 'c');
//        System.out.println((char) ('a' + 4));

        // Ex. 1.2.10
//        int  a = 2147483647; 
//        System.out.println(a);
//        System.out.println(a+1);
//        System.out.println(2-a);
//        System.out.println(-2-a);
//        System.out.println(2*a);

        // Ex. 1.2.11
//        double a = 3.14159;
//        System.out.println(a);
//        System.out.println(a+1);
//        System.out.println(8/(int) a);
//        System.out.println(8/a);
//        System.out.println((int) (8/a));
//        System.out.println(4*a);

        // Ex. 1.2.13
//        boolean bool2 = (Math.sqrt(2) * Math.sqrt(2) == 2); // false
//        System.out.println(bool2);

        // Ex. 1.2.17
        int a = 1;
        a = a + a;
        a = a + a;
        a = a + a; // 8
        System.out.println(a);

        boolean b = true;
        b = !b; //f
        b = !b; //t
        b = !b; // false
        System.out.println(b);

        int c = 2;
        c = c * c;
        c = c * c;
        c = c * c;  // 256
        System.out.println(c);





    
    
    }

}
