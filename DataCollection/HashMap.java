package DataCollection;

import java.util.Map;

public class HashMap
{
  public static void main (String[] args)
  {
      Map<String, String> map = new java.util.HashMap<>();

      map.put("California\t","\tSacramento");
      map.put("Oregon\t", "\tSalem");
      map.put("Washington\t", "\tOlympia");
      System.out.println(map);


      map.put("\tAlaska", "\tJuneau");
      System.out.println(map);

      String cap = map.get("Oregon\t");
      System.out.println("The Capital of Oregon is:" + cap);

      map.remove("California\t");
      System.out.println(map);

  }//End of main

}//End of class
