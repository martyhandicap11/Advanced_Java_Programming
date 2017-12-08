package WorkingWithDataTypes;

/*
Created By Martin Cooney

This is the an example of a class instantiating itself
 */
public class ClothingItem
{

     public String type; /*
                          Not Static known as an instance variable
                          Not a member of the class itself
                          It is a member of an instance of the class
                          */

    public  static  void main(String[] args)
     {
         /*
         Create an instance of the ClothingItem Class
          */
         ClothingItem item = new ClothingItem();// Instantiation
         item.type = "Hat";
         item.displayItem();

     }// end of main

    /*
    Create an instance method
     */
     private  void  displayItem()// Member of an instance of the class
     {
         System.out.println("This is a \t" + this.type);// Output info relating to the instance of the class
     }

}//End of class