package CommonJavaLibraries;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class NewIO
{
    public static void main (String[] args)
    {
        Path sourceFile = Paths.get("C:/Users/Marty/AndroidStudioProjects/" +
                        "Advanced Java Programming/src/CommonJavaLibraries/",
                "lorenipsum");
        Path targetFile = Paths.get("C:/Users/Marty/AndroidStudioProjects/" +
                        "Advanced Java Programming/src/CommonJavaLibraries/",
                "target01");

        try {
            Files.copy(sourceFile, targetFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied!");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }//end of main

}//end of class NewIO
