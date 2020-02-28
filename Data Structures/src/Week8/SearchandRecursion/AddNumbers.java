package Week8.SearchandRecursion;

public class AddNumbers {

    public static int addNumbers(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        else return n + addNumbers(n-1);
    }

    public static void main(String[] args) {
        System.out.println(addNumbers(4));

    }

}
    