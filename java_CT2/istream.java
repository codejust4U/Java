import java.io.fileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class istream {
    public static void main(String[] args) {
        try {
            InputStream is = new InputStream("input.txt");
            int data;
            while ((data = is.read()) != -1) {
                System.out.println((char) data);
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
