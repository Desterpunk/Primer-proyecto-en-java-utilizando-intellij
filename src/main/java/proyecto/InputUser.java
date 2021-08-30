package proyecto;

import java.io.*;

public class InputUser {
    public static void main(String[] args) {
        InputText userName = new InputText("Name");
        InputText userCell = new InputText("Cellphone");
        InputText userAge = new InputText("Age");

        System.out.println("Bienvenido señor " + userName.getText() + " es un placer para nosotros contar con una persona de " +userAge.getText()+
                " años. Próximamente nos comunicaremos con usted al numero " + userCell.getText() +".\nFeliz día;");
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
