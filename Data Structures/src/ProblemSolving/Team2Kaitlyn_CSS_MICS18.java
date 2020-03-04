package ProblemSolving;

import java.util.Scanner;

public class Team2Kaitlyn_CSS_MICS18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cases = input.nextInt();

        for (int i = 0; i < cases; i++) {
            int scalingFactor = input.nextInt();
            System.out.println("Case: " + (i+1));
            for (int j = 0; j < scalingFactor * 5; j++) {
                if (j < scalingFactor || j >= scalingFactor * 4) {
                    for (int k = 0; k < scalingFactor * 5; k++) {
                        System.out.print("C");
                    }
                } else {
                    for (int k = 0; k < scalingFactor; k++) {
                        System.out.print("C");
                    }
                    for (int k = 0; k < scalingFactor * 4; k++) {
                        System.out.print(" ");
                    }
                }
                for (int k = 0; k < scalingFactor * 5; k++) {
                    System.out.print(" ");
                }
                if (j < scalingFactor || j >= scalingFactor * 4 || (j >= scalingFactor * 2) && j < scalingFactor * 3) {
                    for (int k = 0; k < scalingFactor * 5; k++) {
                        System.out.print("S");
                    }
                } else if (j >= scalingFactor && j < scalingFactor * 2) {
                    for (int k = 0; k < scalingFactor; k++) {
                        System.out.print("S");
                    }
                    for (int k = 0; k < scalingFactor * 4; k++) {
                        System.out.print(" ");
                    }
                } else {
                    for (int k = 0; k < scalingFactor * 4; k++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < scalingFactor; k++) {
                        System.out.print("S");
                    }
                }
                for (int k = 0; k < scalingFactor * 5; k++) {
                    System.out.print(" ");
                }
                if (j < scalingFactor || j >= scalingFactor * 4 || (j >= scalingFactor * 2) && j < scalingFactor * 3) {
                    for (int k = 0; k < scalingFactor * 5; k++) {
                        System.out.print("S");
                    }
                } else if (j >= scalingFactor && j < scalingFactor * 2) {
                    for (int k = 0; k < scalingFactor; k++) {
                        System.out.print("S");
                    }
                    for (int k = 0; k < scalingFactor * 4; k++) {
                        System.out.print(" ");
                    }
                } else {
                    for (int k = 0; k < scalingFactor * 4; k++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < scalingFactor; k++) {
                        System.out.print("S");
                    }
                } System.out.println();
            }
            if (cases > 1) {
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
            }
        }
    }
}
