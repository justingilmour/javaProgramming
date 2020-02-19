package Week3;

import java.util.Scanner;

public class Parameters {

    public static int countNumbers() {
        Scanner input = new Scanner(System.in);
        String in = "";

        int count = 0;
        System.out.println("Enter an int or q to quit: ");
        in = input.next();

        while (!in.equalsIgnoreCase("q")) {
            int num = Integer.parseInt(in);
            if (num >= 10 && num <= 15) {
                count++;
            }
            System.out.println("Enter an int or q to quit: ");
            in = input.next();
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumbers());
    }

    }
