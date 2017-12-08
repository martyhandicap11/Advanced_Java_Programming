package WorkingWithDataTypes;

public class PasringStrings
{
    public static void main(String[] args)
    {
        //Prints out total length of string
        String s1 = "Welcome to California!";
        System.out.println("Length of String!\t" + s1.length());

        //Prints out position of California!
        int position = s1.indexOf("California");
        System.out.println("Position of substring:\t" + position);

        //Prints out California!
        String subStr = s1.substring(11);
        System.out.println("Substring:\t" + subStr);

        /*
        Demonstrate using trim to
        manage whitespace
         */
        String s2 ="Welcome!       ";
        int len1 = s2.length();
        System.out.println(len1);// Prints out additional white space
        String s3 = s2.trim();
        System.out.println("Result after removing White:\t" + s3.length());




    }// end of main





}//End of class
