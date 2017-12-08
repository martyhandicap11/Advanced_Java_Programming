package WorkingWithDataTypes;

import java.util.Scanner;

public class BuildingStringsFromMultipleValues
{
    public static void main(String[] args)
    {
        /*
        This below works but not
        economical in regards to
        memory management if dealing
        with many strings, 3 Objects are
        created
         */
        String str1 = "Hello";
        String str2 = "World";
        String str3 =  str1 + " " + str2 +" !";
        System.out.println(str3);

        /*
        It is better to use the StringBuilder class
        member of the Java.lang package
        One Object is created instead of three
         */
        StringBuilder strBuid = new StringBuilder("Hello")
        .append(", ")
        .append("World")
        .append("! ");
        System.out.println(strBuid);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value:");
        String input = scan.nextLine();
        System.out.println(input);

        strBuid.delete(0, strBuid.length());
        for (int i = 0; i < 3; i++)
        {
            input = scan.nextLine();
            strBuid.append(input + "\n");
        }

        System.out.println(strBuid);

    }// end of main

}//~End of Class
