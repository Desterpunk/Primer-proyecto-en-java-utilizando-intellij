package proyecto;

import java.io.*;
import java.util.logging.*;

public class InputUser {
    public static void main(String[] args) {
        String text = "";
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            text = bufferedReader.readLine();
        } catch (Exception e){
            Logger loggerError = Logger.getLogger("Error reading");
            loggerError.log(Level.WARNING, "ERROR READING THE INFORMATION");
        }
        Logger loggerOutputName = Logger.getLogger("Output info name");
        loggerOutputName.log(Level.INFO,"{0}",text);
    }
}
