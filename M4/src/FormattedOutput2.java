//Formatting Using the DecimalFormat Class:

import java.text.DecimalFormat;

// definition of the class
public class FormattedOutput2 {
    public static void main(String[] args) {
        double x = 1234567.123;
        // printing the number
        System.out.printf(" \n The number is : %f \n ", x);
        // printing only the numeric part of the floating number
        DecimalFormat ft = new DecimalFormat(" # ");
        System.out.println(" \n Without fraction part the number is : " + ft.format(x));
        // printing the number only upto 2 decimal places
        ft = new DecimalFormat(" #.## ");
        System.out.println(" \n Formatted number with the specified precision is = " + ft.format(x));
        // automatically appends zero to the rightmost part of decimal, instead of #, we use digit 0
        ft = new DecimalFormat(" #.000000 ");
        System.out.println(" \n Appending the zeroes to the right of the number = " + ft.format(x));
        // automatically appends zero to the leftmost of decimal number instead of #, we use digit 0
        ft = new DecimalFormat(" 00000.00 ");
        System.out.println(" \n Appending the zeroes to the left of the number = " + ft.format(x));
        // formatting money in dollars
        double income = 5590909.789;
        ft = new DecimalFormat(" ###,###.## ");
        System.out.println(" \n Your Formatted Income in Dollars : " + ft.format(income));
    }
}