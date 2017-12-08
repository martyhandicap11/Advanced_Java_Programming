package DataCollection;

import java.util.Arrays;

public class SimpleArrays
{
    public static void main (String[] args)
    {
        System.out.println("Array of primitives");

        int[] intArr = {9, 6, 3};// size cannot be changed but values can
        Arrays.sort(intArr);
        for (int i = 0; i < intArr.length; i++)
        {
            System.out.println("\t" + intArr[i]);

        }//end of int for

        System.out.println("\nArray of strings");

        String[] StrArr = {"Red", "Green", "Blue"};
        Arrays.sort(StrArr);
        for (String color : StrArr)
        {
            System.out.println(color);

        }//end of String for

        System.out.println("\nArray of initial size");

        int [] arrSize = new int[10];
        for (int i = 0; i < arrSize.length; i++)
        {
            arrSize[i] = i * 100;
        }

        for (int value: arrSize)
        {
            System.out.println(value);

        }//end of for size


        System.out.println("\nCopying an array");
        int[] copyArr = new int[5];
        System.arraycopy(arrSize,5, copyArr, 0, 5);
        for(int value : copyArr)
        {
            System.out.println(value);

        }//end of forCopy

    }//End of main

}//End of class
