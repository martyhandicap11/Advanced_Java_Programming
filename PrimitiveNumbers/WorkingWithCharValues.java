package PrimitiveNumbers;

public class WorkingWithCharValues
{
    public  static  void main(String[] args)
    {

        char c1 = '1';
        char c2 = '2';
        char c3 = '3';

        System.out.println("Char 1:\t" + c1 );
        System.out.println("Char 2:\t"+ c2 );
        System.out.println("Char 3:\t" + c3 );

        char dollarSign = '\u0024';
        System.out.println("Currency:\t" + dollarSign );

        char a1 = 'a';
        char a2 = 'b';
        char a3 = 'c';

        System.out.print(Character.toUpperCase(a1));
        System.out.print(Character.toUpperCase(a2));
        System.out.println(Character.toUpperCase(a3));

        System.out.print(Character.toLowerCase(a1));
        System.out.print(Character.toLowerCase(a2));
        System.out.println(Character.toLowerCase(a3));

    }// end of main

}//End of class
