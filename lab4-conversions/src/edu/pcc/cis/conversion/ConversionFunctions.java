package edu.pcc.cis.conversion;

/**
 * A library of conversion functions
 *
 * @author Cara Tang and Quinn Shappell
 * @version 2018.05.01
 */
public class ConversionFunctions {
    private static final String[] MONTH_NAMES = { "", "January", "February", "March", "April",
            "May", "June", "July", "August", "September", "October", "November", "December" };

    /**
     * Convert a temperature from celsius to fahrenheit
     * @param celsius temperature in degrees celsius
     * @return the fahrenheit equivalent of the given celsius temp
     */
    public static int celsiusToFahrenheit(int celsius) {
        return (int)(Math.round(9.0*celsius/5) + 32);
    }

    /**
     * Convert cups to tablespoons. There are 16 tablespoons in a cup.
     * @param cups the number of cups to convert
     * @return the number of tablespoons in the given number of cups
     */
    public static int cupsToTablespoons(int cups) {
        return (cups * 16);
    }

    /**
     * Convert a month number to the string name of the month
     * @param monthNum a month number, from 1 to 12
     * @return the name of the given month, or empty string if the month number is invalid
     */
    public static String monthNumToMonthName(int monthNum) {
        // This method does not work correctly. You will fix it as you work through the tests.
        // Remove these comments once it is implemented correctly.
        if (monthNum > 12 || monthNum < 0) {
            return "";
        } else {
        return MONTH_NAMES[monthNum];}
    }
}
