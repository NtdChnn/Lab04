/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author notda
 */

import java.util.GregorianCalendar ;

public class Exercise02 {
    public static void main(String[] args) {
        GregorianCalendar current = new GregorianCalendar();
        long currentYear = current.get(GregorianCalendar.YEAR);
        long currentMonth = current.get(GregorianCalendar.MONTH);
        long currentDOW = current.get(GregorianCalendar.DAY_OF_WEEK);
        long currentDate = current.get(GregorianCalendar.DATE);
        
        GregorianCalendar tomorrow = new GregorianCalendar();
        tomorrow.setTimeInMillis(tomorrow.getTimeInMillis()+(24*60*60*1000));
        
        long tomorrowYear = tomorrow.get(GregorianCalendar.YEAR);
        long tomorrowMonth = tomorrow.get(GregorianCalendar.MONTH);
        long tomorrowDOW = tomorrow.get(GregorianCalendar.DAY_OF_WEEK);
        long tomorrowDate = tomorrow.get(GregorianCalendar.DATE);
       
        
        System.out.println("year is "+ currentYear +"\nmonth is "+ currentMonth + "\nday is "+ currentDate+"\ndate of week is " + currentDOW);
        System.out.println("----------");
        System.out.println("year is "+ tomorrowYear +"\nmonth is "+ tomorrowMonth + "\nday is "+ tomorrowDate+"\ndate of week is " + tomorrowDOW);
        System.out.println(tomorrow.getTime());
        
    }
}
