package ProblemSolving;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;

public class Team2Justin_MountainSort_MICS12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] original = new int[count];
        int difference = 0;
        int[] mountain = new int[count];
        int index = count/2;
        boolean isLeft = false;

        for (int i = 0; i < count; i++){
            original[i] = input.nextInt();
        }
        Arrays.sort(original);

        for (int i = count - 1; i >= 0; i--){
            if (isLeft){
                mountain[index-difference] = original[i];
                isLeft = false;
            } else {
                mountain[index+difference] = original[i];
                isLeft = true;
                difference++;
            }
        }
        System.out.println(mountain.length);
        for(int i: mountain){
            System.out.println(i);
        }
    }
}
