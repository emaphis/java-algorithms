/******************************************************************************
 *  Name:    Ed Maphis 
 *
 *  Description: Chapter 1.2 Notes
 *
 ******************************************************************************/

Built-in Types of data

Eight primitive types
int     (+ - * / %) –2147483648 (-2^31) and 2147483647 (2^31-1).
double  (+ - m * /)
boolean (&& || !)
String  (+)

Literals

Operators

Identifiers

Variables

Declaration statements


Variable naming conventions
Book convention - consists of lowercase letter followed by uppercase
  letters and digits.
  ex: i, x, y, sum, isLeapYear, outDegrees. - camelCase.

  Constants -  uppercase letter followed by uppercase, digit,
                underscore '_'.


Converting number to strings for input:
  Double.parseDouble();
  Integer.ParseInt();
  Integer.parseInt("123");
  Integer.parseInt(args[0]);


Commonly used library APIs
  Integer.parseInt("123")  => 123
  Double.parseDouble("1.5") => 1.5
  Math.sqrt(5.0*5.0 - 4.0*4.0) => 3.0
  Math.log(Math.E)  => 1.0
  Math.random()  => random in [0,1]
  Math.max(1.0, 9.0)  => 9.0
  Math.round(3.14159)  => 3

public class Math
    double abs(double)
    double max(double, double)
    double min(double a, double b) minimum of a and b
    Note 1: abs(), max(), and min() are defined also for int, long, and float.
    double sin(double theta) sine of theta
    double cos(double theta) cosine of theta
    double tan(double theta) tangent of theta
    Note 2: Angles are expressed in radians. Use toDegrees() and toRadians()
            to convert.
    Note 3: Use asin(), acos(), and atan() for inverse functions
    double exp(double a) - exponential (e a)
    double log(double a) -  natural log (loge  a, or ln a)
    double pow(double a, double b) - raise a to the bth power (ab )
    long round(double a) - round a to the nearest integer
    double random() - random number in [0, 1)
    double sqrt(double a)- square root of a
    double E value of e (constant)
    double PI value of  (constant)
