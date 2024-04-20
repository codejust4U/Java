
import java.io.InputStream;
import java.net.*;

public class URL_connection {
    @SuppressWarnings("deprecation")
    public static void main(String args[]) {
        try {
            URL url = new URL("https://www.universityacademy.in/P/about.html");
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
                break;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
