package PrimitiveNumbers;

public class BooleanValuesExpressions
{

    static boolean bDef;

    public  static void main(String[] args)
   {
       boolean b1 = true;
       boolean b2 = false;

       System.out.println("The value of b1 is:\t" + b1);
       System.out.println("The value of b2 is:\t" + b2);
       System.out.println("The value of bDef is:\t" + bDef);

       boolean b3 = !b1;
       System.out.println("The value of b3 is:\t" + b3);

       int iL =0;
       boolean b4 = (iL !=0);
       System.out.println("The value of b4 is:\t" + b4);

       String sBoolean = "true";
       boolean parsed = Boolean.parseBoolean(sBoolean);
       System.out.println("Parsed String:\t" + parsed);
   }

}
