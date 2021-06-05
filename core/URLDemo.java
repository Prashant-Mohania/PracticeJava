import java.net.*;
import java.io.*;

class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://premium.infomatics.info");
            URLConnection urlConnection = url.openConnection();
            // \u000d
            // System.out.println(url.getProtocol());
            InputStream stream = urlConnection.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.println((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
