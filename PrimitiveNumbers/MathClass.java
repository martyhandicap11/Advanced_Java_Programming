package PrimitiveNumbers;

public class MathClass
{
  public static void main(String[] args)
  {
      int intValue1 = 56;
      int intValue2 = 42;

      int result1 = intValue1 + intValue2;
      System.out.println("Addition:\t" + result1);

      int result2 = intValue1 - intValue2;
      System.out.println("Subtraction:\t" + result2);

      int result3 = intValue1 * intValue2;
      System.out.println("Multiplication:\t" + result3);

      double result4 = (double) intValue1 / intValue2;
      System.out.println("Division:\t" + result4);

      int result5 = intValue1 % intValue2;
      System.out.println("Remainder:\t" + result5);


      double doubleValue = 3.99999;
      long rounded = Math.round(doubleValue);
      System.out.println("Rounded:\t" + rounded);

      double absValue = Math.abs(doubleValue);
      System.out.println("Remainder:\t" + absValue);


  }

}
