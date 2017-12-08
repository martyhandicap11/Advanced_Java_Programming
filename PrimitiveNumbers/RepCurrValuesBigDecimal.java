package PrimitiveNumbers;

import java.math.BigDecimal;

public class RepCurrValuesBigDecimal
{

    public static void main(String[] args)
    {
        double value = .012;

        double pSum = value + value + value;

        /*
          The result will .36 a bunch of zeros and a 4
          other calculations based on this result will be
          imprecise
        */
        System.out.println("The Sum Of the primitives" + pSum);

        /*
        To fix this Java provides a class called BigDecimal
        specifically designed to take care of this precision
        problem
         */

        String strValue = Double.toString(value);
        System.out.println("strValue:\t" + strValue);
        BigDecimal bigValue = new BigDecimal(strValue);

        BigDecimal bSum = bigValue.add(bigValue).add(bigValue);

        System.out.println("Sum of BigDecimals\t" + bSum.toString());
    }


}
