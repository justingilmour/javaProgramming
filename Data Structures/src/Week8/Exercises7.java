package Week8;

public class Exercises7 {
    // easiest case is the empty case or one letter string
    public static String reverse(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return str;
        } else {
             return str.substring(str.length()-1) + reverse(str.substring(0, str.length()-1));

        }
    }

    public static void main(String[] args) {
        String s = "abc";
        s = s.substring(1, s.length());
        System.out.println(s);
    }
}
