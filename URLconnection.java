/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
*/

/**
 *
 * @author panka
 */

//import java.io.*;
import java.net.*;

public class URLconnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            @SuppressWarnings("deprecation")
            URL url = new URL("https://www.universityacademy.in/P/about.html");
            System.out.println("Protocol : " + url.getProtocol());
            System.out.println("Post name : " + url.getHost());
            System.out.println("Port no : " + url.getPort());
            System.out.println("File name : " + url.getFile());
        } catch (MalformedURLException e) {
            System.out.println("URL not found...");
        }
    }
}
