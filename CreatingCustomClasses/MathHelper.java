package CreatingCustomClasses;

public class MathHelper
{
    public   static double addValues(String str1, String str2)
    {
        double dble1 = Double.parseDouble(str1);
        double dble2 = Double.parseDouble(str2);
        return dble1 + dble2;

    }
    public   static double subtractValues(String str1, String str2)
    {
        double dble1 = Double.parseDouble(str1);
        double dble2 = Double.parseDouble(str2);
        return dble1 - dble2;

    }
    public   static double multiplyValues(String str1, String str2)
    {
        double dble1 = Double.parseDouble(str1);
        double dble2 = Double.parseDouble(str2);
        return dble1 * dble2;

    }
    public   static double devideValues(String str1, String str2)
    {
        double dble1 = Double.parseDouble(str1);
        double dble2 = Double.parseDouble(str2);
        return dble1 / dble2;

    }


}//End of class MathHelper
