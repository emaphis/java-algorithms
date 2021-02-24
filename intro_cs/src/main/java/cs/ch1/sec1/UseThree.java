/******************************************************************************
 *  Compilation:  javac UseThree.java
 *  Execution:    java UseThree Alice Bob Carrol
 *  Produces      "Hi Carrol, Bob, and Alice"
 *
 *  Author:       Ed Maphis
 *  Exercise:     1.1.6
 *  Description:  A program that prints out three parameters in reverse order.
 ******************************************************************************/

package cs.ch1.sec1;

public class UseThree {
    // given Alice Bob Carrol
    // prints "Hi Carrol, Bob, and Alice
    public static void main(String[] args) {
        System.out.print("Hi, ");
        System.out.print(args[2]);
        System.out.print(", ");
        System.out.print(args[1]);
        System.out.print(", and ");
        System.out.println(args[0]);
    }

}
