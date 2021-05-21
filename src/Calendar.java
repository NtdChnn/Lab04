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
    
    
public class Calendar {
    
public GregorianCalendar current = new GregorianCalendar();
    public long currentYear = current.get(GregorianCalendar.YEAR);
    public long currentMonth = current.get(GregorianCalendar.MONTH);
    public long currentDOW = current.get(GregorianCalendar.DAY_OF_WEEK);
    public long currentDate = current.get(GregorianCalendar.DATE);

    public GregorianCalendar GCAL2 = new GregorianCalendar();
    public GregorianCalendar GCAL3 = new GregorianCalendar();
 
    public String current() {
        return ("year is "+ currentYear +"\nmonth is "+ currentMonth + "\nday is "+ currentDate+"\ndate of week is " + currentDOW );
    }

     public String tomor() {
         GCAL2.setTimeInMillis(0L);

    long elapsedtime = current.getTimeInMillis() - GCAL2.getTimeInMillis() + 86400000L;
    GCAL3.setTimeInMillis(elapsedtime);


    long CurrentYear3 = GCAL3.get(GregorianCalendar.YEAR);
    long CurrentMonth3 = GCAL3.get(GregorianCalendar.MONTH);
    long CurrentOW3 = GCAL3.get(GregorianCalendar.DAY_OF_WEEK);
    long CurrentDate3 = GCAL3.get(GregorianCalendar.DATE);
 
    return ("year is "+ CurrentYear3 +"\nmonth is "+ CurrentMonth3 + "\nday is "+ CurrentDate3 + "\ndate of week is " + CurrentOW3 );
    }

    public static void main(String[] args)
    {
        Calendar calTomorrow = new Calendar();

        System.out.println(calTomorrow.current());
        System.out.println("-----------");
        System.out.println("After specified the elapsed time of one day after current day");
        System.out.println(calTomorrow.tomor());
        System.out.print(calTomorrow.GCAL3.getTime());
    }
    
}
