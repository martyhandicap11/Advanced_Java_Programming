package CommonJavaLibraries;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class CopyFile
{
    public static void main(String[] args) {
        String sourrceFile = "C:/Users/Marty/AndroidStudioProjects/Advanced Java Programming/src" +
                "/CommonJavaLibraries/lorenipsum";
        String targetFile = "C:/Users/Marty/AndroidStudioProjects/Advanced Java Programming/src/" +
                "CommonJavaLibraries/target";

        try (
                FileReader fileReader = new FileReader(sourrceFile);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                FileWriter fileWriter = new FileWriter(targetFile)
        ) {

           while (true)
           {
               String line = bufferedReader.readLine();
               if (line == null)
               {
                  break;
               }
               else
               {
                  fileWriter.write(line + "\n");
               }
           }
            System.out.println("File copied");
        } catch (Exception e){
            e.printStackTrace();
        }


    }//end of main


}//end of CopyFile
