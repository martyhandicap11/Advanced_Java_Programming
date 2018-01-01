package CommonJavaLibraries;


import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Internet
{
    private static final String FLOWERS_FEED =
            "https://www.w3schools.com/xml/cd_catalog.xml";

    public static void main(String[] args) throws IOException {
        InputStream stream = null;
        BufferedInputStream buf = null;

        try {
            URL url = new URL(FLOWERS_FEED);
            stream = url.openStream();
            buf = new BufferedInputStream(stream);

            StringBuilder strBuild = new StringBuilder();

            while (true)
            {
                int data = buf.read();

                if(data == -1)
                {
                    break;
                }
                else
                {
                   strBuild.append((char)data);
                }
            }
            System.out.println(strBuild);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            stream.close();
            buf.close();
        }
    }

}//end of class Internet
