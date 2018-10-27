/******************************************************************************
 *  Compilation:  javac MercatorProj.java
 *  Execution:    java MercatorProj double double double
 *
 *  Author:  Ed Maphis
 *  Section: 1.2 - Built-in Types of Data
 *  Program: 1.2.31 - MercatorProj.java
 *
 *  Description: Mercator projection.
 *  Exercise: The Mercator projection is a conformal (anglepreserving)
 *           projection that maps latitude lat and longitude lon to rectangular
 *           coordinates (x, y). It is widely used—for example, in nautical
 *           charts and in the maps that you print from the web.
 *           The projection is defined by the equations x = lon - lon0 and
 *           y = 1/2 ln ((1 + sin lat) / (1 - sin lat)), where lon0 is the
 *           longitude of the point in the center of the map.
 *           Write a program that takes lon0 and the latitude and longitude of
 *           a point from the command line and prints its projection.
 *  Formula:
 ******************************************************************************/

package cs.ch1.sec2;

/**
 * @author emaphis
 *
 */
public class MercatorProj {

    /**
     * @param args
     */
    public static void main(String[] args) {
        double lon0 = Double.parseDouble(args[0]);
        double lat = Double.parseDouble(args[1]);
        double lon = Double.parseDouble(args[2]);

        double x = lon - lon0;
        double y = 0.5 * Math.log((1.0 + Math.sin(lat)) / (1.0 - Math.sin(lat)));
        System.out.println(x);
        System.out.println(y);
    }

}
