package ProblemSolving;

import java.util.Scanner;

public class Team2Kaitlyn_UND_MICS15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++){
            int scalingFactor = input.nextInt();
            System.out.println("A scaling factor of " + scalingFactor + " would produce: ");
            for (int j = 0; j < scalingFactor * 3; ){
                if (j < scalingFactor || j >= scalingFactor * 2){
                    for (int k = 0; k < scalingFactor * 5; k++){
                        System.out.print("|");
                    }
                }

            }
        }

    }
}
