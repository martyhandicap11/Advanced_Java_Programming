package CreatingCustomClasses;

import java.util.Scanner;

public class CalculatorNestedClasses
{
    public static void main (String[] args)
    {
        CalculatorNestedClasses calcNest = new CalculatorNestedClasses();
        calcNest.calculate();

    }//end of main

    protected  void calculate() {

        InputHelper helper = new InputHelper();

        String str1 = helper.getInput("Enter numeric value");
        String str2 = helper.getInput("Enter numeric value");
        String oper = helper.getInput("Choose an operation (+ - * /):");

        double result = 0;

        try
        {
            switch (oper)
            {
                case "+":
                    result = MathHelperNested.addValues(str1, str2);
                    break;
                case "-":
                    result = MathHelperNested.subtractValues(str1, str2);
                    break;
                case "*":
                    result = MathHelperNested.multiplyValues(str1, str2);
                    break;
                case "/":
                    result = MathHelperNested.devideValues(str1, str2);
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
    }
    class InputHelper
    {
        private   String getInput(String prompt)
        {
            System.out.println(prompt);
            Scanner scan = new Scanner(System.in);
            return scan.nextLine();
        }

    }


}//End of CalculatorNestedClasses
