package DataCollection;

public class MultiArrays
{
    public static void main (String[] args)
    {

        //Data Structure
        String [][] states = new  String[3][2];
        states[0][0] = "California";
        states[0][1] = "Sacramento";
        states[1][0] = "Oregon";
        states[1][1] = "\tSalem";
        states[2][0] = "Washington";
        states[2][1] = "Olympia";

        for (int i = 0; i < states.length; i++)
        {
            StringBuilder strBuilder = new StringBuilder();
            strBuilder.append("The Capital of\t" )
                    .append(states [i] [0])
                    .append("\tis")
                    .append(states [1][1])
                    .append(".");
            System.out.println(strBuilder);
            
        }//End of for




    }//end of main

}//End of class
