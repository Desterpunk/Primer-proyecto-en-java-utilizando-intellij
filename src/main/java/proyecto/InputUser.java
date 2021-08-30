package proyecto;

import java.io.*;

public class InputUser {
    public static void main(String[] args) {
        InputText inputText1 = new InputText("name");
        System.out.println("inputText1.getText() = " + inputText1.getText());
    }
}

class InputText {
    java.lang.String text = "";

    public InputText(String requiredInfo) {
        System.out.println("Please enter your " + requiredInfo + ":");
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {
            text = bufferedReader.readLine();
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getText() {
        return text;
    }
}
