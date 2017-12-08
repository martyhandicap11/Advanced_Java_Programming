package WorkingWithDataTypes;

public class CharArrayToAString
{
    public static void main(String[] args)
    {
       //Create an Array
       char[] chars = {'H','e','l','l','o','!'};

       /*Turn it into a String Object using String Constructor Method
       and pass in char value
        */
       String s = new String(chars);

        System.out.println(s);

    }// end of main
}//