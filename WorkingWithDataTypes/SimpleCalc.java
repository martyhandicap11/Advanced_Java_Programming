package WorkingWithDataTypes;

import java.util.Scanner;

public class SimpleCalc
{
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number:");
        String input01 = scan.nextLine();
        double d1 = Double.parseDouble(input01);

        System.out.print("Enter number:");
        String input02 = scan.nextLine();
        double d2 = Double.parseDouble(input02);

        double result = d1 + d2;


        System.out.println("The answer is " + result);



    }












}//end of class
