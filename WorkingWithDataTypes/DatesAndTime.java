package WorkingWithDataTypes;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.GregorianCalendar;


public class DatesAndTime
{
    public static void main(String[] args)
    {
        //Outputs current date, time and Time Zone
        Date date = new Date();
        System.out.println(date);

        //Output specific date
        GregorianCalendar gregCal = new GregorianCalendar(2009, 1,
                28);
        gregCal.add(GregorianCalendar.DATE, 1);
        Date date2 = gregCal.getTime();
        System.out.println(date2);

        //Format the date
        DateFormat dateFor = DateFormat.getDateInstance(DateFormat.FULL);
        System.out.println(dateFor.format(date2));

        //Java 8 version of date hanloing

        LocalDateTime locDatTime = LocalDateTime.now();
        System.out.println(locDatTime);

        LocalDate localDate = LocalDate.of(2009, 1, 28);
        System.out.println(localDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");
        System.out.println(dateTimeFormatter.format(localDate));

    }// end of main

}//End of class
