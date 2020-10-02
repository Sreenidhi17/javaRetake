/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question_09;

import java.util.GregorianCalendar;

/**
 *
 * @author Sreenidhi Madala
 */
public class GregorianCalenda {

    public static void main(String[] args) {
//  Creating the GregorianCalendar object so that we can get Day, Month and year
        GregorianCalendar gc = new GregorianCalendar();
//    	Displaying the current year, month, and day.
        System.out.println("Current year : " + gc.get(gc.YEAR) + ", Month : "
                + ((gc.get(gc.MONTH)) + 1) + ", and Day :" + gc.get(gc.DAY_OF_MONTH));
//        Setting the TimeInMill so that we cen get the date,Month and year of 
//          that particular time
        gc.setTimeInMillis(1234567898765L);
//        the setTimeInMillis(long) sets the current calanders time of the given
//          long value. and it does not retun any value
        System.out.println("elapsed time since January 1, 1970 the year is:"
                + gc.get(gc.YEAR) + ", month : " + ((gc.get(gc.MONTH)) + 1)
                + ", and day :" + gc.get(gc.DAY_OF_MONTH));
    }
}
