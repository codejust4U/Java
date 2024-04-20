import java.net.Socket;
import java.io.*;

class socket {
    public static void main(String[] args) throws Exception {
        int c;
        Socket s = new Socket("whois.internic.net", 43); // Corrected the server address
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        String str = (args.length == 0 ? "MHProfessional.com" : args[0]);

        byte[] buf = str.getBytes(); // Corrected variable name 'but' to 'buf'
        out.write(buf); // Corrected sending data through the output stream

        while ((c = in.read()) != -1) {
            System.out.print((char) c);
        }
        s.close();
    }
}
