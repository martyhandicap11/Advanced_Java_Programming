package DataCollection;

import java.util.List;


public class ArrayList
{
    public static void main (String[] args)
    {
        List<String> arrList = new java.util.ArrayList<>();

        arrList.add("California");
        arrList.add("Oregon");
        arrList.add("Washington");

        System.out.println(arrList);

        arrList.add("Alaska");
        System.out.println(arrList);

        arrList.remove(0);
        System.out.println(arrList);

        String state = arrList.get(1);
        System.out.println("\nThe second state is :\t" + state);

        int positionArr = arrList.indexOf("Alaska");
        System.out.println("\nAlaska is at position\t" + positionArr);


    }//End of main
}//End of class
