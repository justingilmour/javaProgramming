package ProblemSolving;

import java.util.Scanner;

public class Team2Kaitlyn_UND_MICS15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            int scalingFactor = input.nextInt();
            System.out.println("Case: " + (i+1));
            for (int j = 0; j < scalingFactor * 5; j++) {
                if (j < scalingFactor || j >= scalingFactor * 4) {
                    System.out.print("|");
                } else {

                }

            }
        }

    }
}
