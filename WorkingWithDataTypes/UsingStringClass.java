package WorkingWithDataTypes;

public class UsingStringClass
{
    public static void main(String[] args)
    {
        String s1 = "\nString is a String\n";
        System.out.println(s1);

        String s2 = new String("\nThis is also a String\n");
        System.out.println(s2);

        String s3 = "Shirt Size:\t";
        String s4 ="M";
        String s5 = s3 + s4 + ", Qty: " + 4;
        System.out.println(s5);

        char[] chars = {'H','e','l','l','o'};
        String s6 = new String(chars);
        System.out.println(s6);

        char[] chars2 = s6.toCharArray();
        for (char c: chars2 )
        {
            System.out.println(c);
        }

    }// end of main

}// end of class
