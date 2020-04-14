package ProblemSolving;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.GenericDeclaration;
import java.util.Arrays;
import java.util.Scanner;

public class Team2Justin_SecretMessage_MICS12 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:/Users/justin.gilmour/Desktop/javaProgramming/Data Structures/src/ProblemSolving/secret_message.txt");
        Scanner message = new Scanner(file);
        String encoded = message.nextLine();
        String[] decoded = new String[encoded.length()];

        for (int i = 0; i < encoded.length(); i++){
            if (encoded.charAt(i) - 65 >= 0 && encoded.charAt(i) - 65 < 26){
                int newLetter = encoded.charAt(i)-65;
                newLetter = 90 - newLetter;
                decoded[i] = Character.toString((char)newLetter);
            } else if (encoded.charAt(i) - 97 >= 0 && encoded.charAt(i) - 97 < 26){
                int newLetter = encoded.charAt(i) - 97;
                newLetter = 122 - newLetter;
                decoded[i] = Character.toString((char)newLetter);
            } else {
                int newLetter = encoded.charAt(i);
                decoded[i] = Character.toString((char)newLetter);
            }
        }
        System.out.println(String.join("",decoded));
    }
}
