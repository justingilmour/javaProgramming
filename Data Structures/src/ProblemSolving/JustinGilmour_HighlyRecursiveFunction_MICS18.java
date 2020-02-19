package ProblemSolving;

import java.util.Arrays;
import java.util.Scanner;

public class JustinGilmour_HighlyRecursiveFunction_MICS18 {

    public static int H(int n){
        if (n <= -8) return H(n+5) + H(n+4) + H(n+2);
        else if (n > -8 && n < 10) return n;
        else return H(n-8) + H(n-5)  + H(n-3);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfInts = input.nextInt();

        for (int i = 0; i < numberOfInts; i++) {
            int n = input.nextInt();
            System.out.println("Case " + (i+1) + ": " + H(n));

        }
        input.close();
    }
}
