package PrimitiveNumbers;

public class ConvertNumValues
{
  public  static void main(String[] args)
  {
      int intValue1 = 56;
      int intValue2 = intValue1; // this will create two copies of the value

      System.out.println("The 2nd value is\t" + intValue2);// The second value  is also 56

      /*
      Next turn this integer into a long integer

      Rules

      (1) When you are converting from s type thst uses a
          smaller amount of memory, to a type that uses a
          larger amount memory, CALLED WIDENING THE TYPE
      */
      long longVslue = intValue1;
      System.out.println("The long value is\t" + longVslue);


      /*(2) When going to from a lsrger to a amaller this
          called NARROWING THE TYPE
       */
      short shortValue1 = (short) intValue1;
      System.out.println("The short value is\t" + shortValue1);

      int intValue3 = 1024;
      byte byteValue = (byte) intValue3;
      System.out.println("The byte value is\t" + byteValue);// Conversion fails because going from a lager to smaller type

      double doubleValue = 3.99999d;
      int intValue4 = (int) doubleValue;
      System.out.println("Double to int\t" + intValue4);// answer is 3 cannot convert form double to int

  }

}
