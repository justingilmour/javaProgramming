package Week2;

import java.util.Scanner;

public class Wednesday {

    public static boolean letters(String str1, String str2, String str3) {
        if (str2.compareTo(str1) < 0 && (str2.compareTo(str3) > 0)) {
            return true;
        } else if (str2.compareTo(str1) > 0 && (str2.compareTo(str3) < 0)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String first = input.nextLine();
        System.out.println("Enter a string: ");
        String second = input.nextLine();
        System.out.println("Enter a string: ");
        String third = input.nextLine();
        System.out.println(letters(first,second,third));

    }
}
