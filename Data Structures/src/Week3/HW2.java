package Week3;
import javax.swing.*;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.jar.JarOutputStream;

public class HW2 {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int num = input.nextInt();
//        if (num % 2 == 0 && num % 5 ==0){
//            System.out.println("The value is exactly divisible by both 2 and 5.");
//        } else if (num % 2 == 0 && num % 5 != 0){
//            System.out.println("The value is exactly divisible by 2 but not 5.");
//        } else if (num % 2 != 0 && num % 5 == 0){
//            System.out.println("The value is exactly divisible by 5 but not by 2.");
//        } else {
//            System.out.println("The value is not exactly divisible by either 2 or 5.");
//        }

// This is number 3.
//        System.out.println("Celsius|Fahrenheit");
//        System.out.println("_______|__________");
//        for (int celsius = 0; celsius <= 100 && celsius >= 0; celsius += 10) {
//            int fahrenheit = celsius * 9/5 +32;
//            System.out.println("     " + celsius +"|" + fahrenheit);
//        }

// This is number 4.
//        for (int odd = 817; odd >= 11; odd -= 2){
//            System.out.println(odd);
//        }
// This is number 7.
//        for (int i = 1, j = 4; (i <= 3 && j > 1); i++, j--)
//            System.out.println("i = " + i + " j = " + j);

// This is number 8.
//        for (int i = 1; i <= 3; i++)
//            for (int j = 4; j > 1; j--)
//                System.out.println("i = " + i + " j = " + j);

// This is number 9.
//        int sum = 0;
//        for (int i = 1; i <= 10; i++){
//            sum = sum + i;
//        }
//        System.out.println(sum);

// This is number 10.
//        String s1 = "Simp";
//        String s2 = "son";
//
//        System.out.println((s1+s2) == "Simpson");
//        System.out.println((s1+s2).equals("Simpson"));
//        System.out.println(s1+s2.equals("Simpson"));
//
//        System.out.println((s1+s2).compareTo("Simpson"));
//        System.out.println("Simpson".compareTo("Timpson"));
//        System.out.println("Simpson".compareTo("Silence"));
//        System.out.println("Simpson".compareTo("Simpleton"));
//        System.out.println("Simpson".compareTo("Simpsonian"));
//        System.out.println("Simpson".compareTo("Sim"));
//        System.out.println("Simpson".compareTo("simpson"));

// This is number 5.
//        DecimalFormat format = new DecimalFormat("#0.000");
//        double travelDistance = 10;
//        int day = 1;
//        double total  = 0;
//        do{
//            total += travelDistance;
//            System.out.println("Day " + day + " distance today = " + format.format(travelDistance) + " total = " + format.format(total));
//            day++;
//            travelDistance *= .7;
//        } while (travelDistance >= .096);
// This is number 11.

        Scanner input = new Scanner(System.in);
        String grade = input.nextLine();
        if (grade.equals("A") || grade.equals("B")|| grade.equals("C") || grade.equals("D")|| grade.equals("F")) {
            switch (grade) {
                case "A":
                    System.out.println("4");
                    break;
                case "B":
                    System.out.println("3");
                    break;
                case "C":
                    System.out.println("2");
                    break;
                case "D":
                    System.out.println("1");
                    break;
                case "F":
                    System.out.println("0");
                    break;
        }

        } else {
            System.out.println("This input is invalid.");
        }




    }

    }
