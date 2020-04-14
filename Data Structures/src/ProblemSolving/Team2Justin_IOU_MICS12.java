package ProblemSolving;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Team2Justin_IOU_MICS12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++){
            int scalingFactor = input.nextInt();
            System.out.println("A scaling factor of " + scalingFactor + " would produce: ");

            for(int j = 0; j < scalingFactor*3; j++){
                if(j < scalingFactor|| j >= scalingFactor*2){
                    for (int k = 0; k < scalingFactor * 3; k++){
                        System.out.print("I");
                    }
                } else {
                    for (int k = 0; k < scalingFactor; k++){
                        System.out.print(" ");
                    }
                    for (int k = 0; k < scalingFactor; k++){
                        System.out.print("I");
                    }
                    for (int k = 0; k < scalingFactor; k++){
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            for (int k = 0; k < scalingFactor; k++) {
                System.out.println();
            }
            for (int j = 0; j < scalingFactor*3; j++){
                if (j < scalingFactor || j >= scalingFactor*2){
                    for (int k = 0; k < scalingFactor * 3; k++){
                        System.out.print("O");
                    }
                } else {
                    for (int k = 0; k < scalingFactor; k++){
                        System.out.print("O");
                    }
                    for (int k = 0; k < scalingFactor; k++){
                        System.out.print(" ");
                    }
                    for (int k = 0; k < scalingFactor; k++){
                        System.out.print("O");
                    }
                }
                System.out.println();
            }
            for (int k = 0; k < scalingFactor; k++){
                System.out.println();
            }
            for (int j = 0; j < scalingFactor*3; j++){
                if (j >= scalingFactor*2){
                    for (int k = 0; k < scalingFactor*3; k++){
                        System.out.print("U");
                    }
                } else {
                    for (int k = 0; k < scalingFactor; k++){
                        System.out.print("U");
                    }
                    for (int k = 0; k < scalingFactor; k++){
                        System.out.print(" ");
                    }
                    for (int k = 0; k < scalingFactor; k++){
                        System.out.print("U");
                    }
                }
                System.out.println();
            }
        }
    }
}
