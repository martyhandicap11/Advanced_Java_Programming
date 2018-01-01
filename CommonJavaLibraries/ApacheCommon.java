package CommonJavaLibraries;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class ApacheCommon
{
    public static void main (String[] args)
    {
        File sourceFile = new File("C:/Users/Marty/AndroidStudioProjects/" +
                "Advanced Java Programming/src/CommonJavaLibraries/",
                "lorenipsum");
        File targetFile = new File("C:/Users/Marty/AndroidStudioProjects/" +
                "Advanced Java Programming/src/CommonJavaLibraries/",
                "target02");

        try {
            FileUtils.copyFile(sourceFile, targetFile);
            System.out.println("File Copied !");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }//end of main

}//end of class ApacheCommon
