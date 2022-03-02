package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

 class LowerCaseEx extends Exception {
    @Override
    public String getMessage(){
        return "S-au introdus doar litere mici!";
    }
}

class UpperCaseEx extends Exception {
    @Override
    public String getMessage(){
        return "S-au introdus doar litere mari!";
    }
}
public class Main {
    public static void main(String[] args) {

        System.out.println("Tastati o propozitie care contine neaparat litere mari si mici ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            String text = br.readLine();
            System.out.println(text);

            //daca toate literele sunt mici (lowercase)- LowerCaseException
            if (text.toLowerCase().equals(text)) throw new LowerCaseEx();
            //daca toate literele sunt mari -UpperCaseException
            if(text.toUpperCase().equals(text)) throw new UpperCaseEx();

        } catch (IOException | LowerCaseEx | UpperCaseEx e) {
            System.out.println(e.getMessage());
        }
    }
}