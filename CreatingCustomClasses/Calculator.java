package CreatingCustomClasses;

import java.util.Scanner;


public class Calculator
{
    public static void main (String[] args)
    {
        String str1 = getInput("Enter numeric value");
        String str2 = getInput("Enter numeric value");
        String oper = getInput("Choose an operation (+ - * /):");

        double result = 0;

        try
        {
            switch (oper)
            {
                case "+":
                    result = MathHelper.addValues(str1, str2);
                    break;
                case "-":
                    result = MathHelper.subtractValues(str1, str2);
                    break;
                case "*":
                    result = MathHelper.multiplyValues(str1, str2);
                    break;
                case "/":
                    result = MathHelper.devideValues(str1, str2);
                    break;
                default:
                    System.out.println("Unrecognised operation");
                    return;
            }
            System.out.println("The answer is\t" + result);

        }catch (Exception e)
        {
            System.out.println("Number formatting exception" + e.getMessage());
        }

    }//end of main

    private  static String getInput(String prompt)
    {
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }


}//End of class
