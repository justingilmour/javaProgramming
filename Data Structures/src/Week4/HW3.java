package Week4;

import com.sun.source.tree.BreakTree;
import org.w3c.dom.ls.LSOutput;

import java.awt.desktop.SystemEventListener;
import java.util.Scanner;

public class HW3 {

//    public static String letters(String str1, String str2, String str3) {
//        if (str1.compareTo(str2) <= 0 && str1.compareTo(str3) <= 0) {
//            return str1;
//        } else if (str2.compareTo(str1) <= 0 && str2.compareTo(str3) <= 0) {
//            return str2;
//        } else {
//            return str3;
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.print("Enter a string: ");
//        String first = input.nextLine();
//        System.out.print("Enter a string: ");
//        String second = input.nextLine();
//        System.out.print("Enter a string: ");
//        String third = input.nextLine();
//        System.out.println(letters(first, second,third));
//    }
//public static int countNumbers() {
//    Scanner input = new Scanner(System.in);
//    String in = "";
//
//    int count = 0;
//    System.out.println("Enter an int or q to quit: ");
//    in = input.next();
//
//    while (!in.equalsIgnoreCase("q")) {
//        int num = Integer.parseInt(in);
//        if (num >= 10 && num <= 15) {
//            count++;
//        }
//        System.out.println("Enter an int or q to quit: ");
//        in = input.next();
//    }
//    return count;
//}
//
//    public static void main(String[] args) {
//        System.out.println(countNumbers());
//    }

    public static void printRows1(int maxRows, int maxCols) {
        for(int row = 0; row < maxRows; row++) {
            for (int col = 0; col < maxCols; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRows1(3,4);
    }


}
