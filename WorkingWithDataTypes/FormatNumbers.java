package WorkingWithDataTypes;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatNumbers
{
    public static void main(String[] args)
    {
        double doubleValue = 1_234_567_89;

        Locale locale = new Locale("da", "DK");

        /*
           Prints out a Number Formatted String
         */
        NumberFormat numForm = NumberFormat.getNumberInstance(locale);
        System.out.println("Number:\t" + numForm.format(doubleValue));

        //Prints Euro sign currency
        NumberFormat curFormat = NumberFormat.getCurrencyInstance();
        System.out.println("Currency:\t" + curFormat.format(doubleValue));

        //Prints Denmark Kronar
        NumberFormat curFormat01 = NumberFormat.getCurrencyInstance(locale);
        System.out.println("Currency:\t" + curFormat01.format(doubleValue));

        //Rounds Number
        NumberFormat intForm = NumberFormat.getIntegerInstance();
        System.out.println("Integer:\t" + intForm.format(doubleValue));


    }// end of main
}//End of Class
