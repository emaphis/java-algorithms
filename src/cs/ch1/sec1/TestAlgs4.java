/****************************************************************************
 * @author emaphis
 *
 * Description: A program that tests the algs4.jar library.
 *
 */
package cs.ch1.sec1;

import edu.princeton.cs.algs4.StdDraw;

public class TestAlgs4 {

   public static void main(String[] args) {
      StdDraw.setScale(-1, 1);
      StdDraw.clear(StdDraw.BLACK);

      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.square(0.0, 0.0, 1.0);

      // write some text
      StdDraw.setPenColor(StdDraw.WHITE);
      StdDraw.text(0.0, +0.95, "Hello, world! This is a test Java Program.");
      StdDraw.text(0.0, -0.95, "Close this window to finish the test.");

      // draw the bullseye.
      StdDraw.setPenColor(StdDraw.BOOK_BLUE);
      StdDraw.filledCircle(0.0, 0.0, 0.9);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.filledCircle(0.0, 0.0, 0.8);
      StdDraw.setPenColor(StdDraw.BOOK_BLUE);
      StdDraw.filledCircle(0, 0, 0.7);
      StdDraw.setPenColor(StdDraw.BLACK);
      StdDraw.filledCircle(0, 0, 0.6);

      // draw a pciture of the textbook.
      //StdDraw.picture(0.0, 0.0, "cover.jpg", 0.65, 0.80);
      System.out.println(System.getProperty("user.dir"));
   }

}
