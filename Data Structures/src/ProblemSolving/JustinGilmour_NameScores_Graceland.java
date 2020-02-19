package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class JustinGilmour_NameScores_Graceland {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOfNames = scan.nextInt();
        String[] allNames = new String[numberOfNames];
        int value = 0;

        for(int i = 0; i < numberOfNames; i++){
            allNames[i] = scan.next();
            String numberSwitch = allNames[i];
            int wordValue = 0;
            for (int j = 0; j < numberSwitch.length() ; j++){
                wordValue += numberSwitch.charAt(j)-64;
            }
            value = value + wordValue * (i + 1);

            }
        System.out.println(value);
    }
}
