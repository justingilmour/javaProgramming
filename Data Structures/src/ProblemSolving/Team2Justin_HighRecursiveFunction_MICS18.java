package ProblemSolving;

import java.util.HashMap;
import java.util.Scanner;

public class Team2Justin_HighRecursiveFunction_MICS18 {
    public static HashMap<Integer, Integer> mn = new HashMap<>();

    public static int M(int n) {
        int total2 = 0;
        if(n <= -8) {
            if (!mn.containsKey(n+5)) mn.put(n+5, M(n+5));
            total2 += mn.get(n+5);

            if (!mn.containsKey(n+4)) mn.put(n+4, M(n+4));
            total2 += mn.get(n+4);

            if (!mn.containsKey(n+2)) mn.put(n+2, M(n+2));
            total2 += mn.get(n+2);

            return total2;
        }
        else if (n > -8 && n < 10) {
            if (!mn.containsKey(n)) mn.put(n, n);
            return n;
        }
        else {
            int total = 0;
            if (!mn.containsKey(n-8)) mn.put(n-8, M(n-8));
            total += mn.get(n-8);

            if (!mn.containsKey(n-5)) mn.put(n-5, M(n-5));
            total += mn.get(n-5);

            if (!mn.containsKey(n-3)) mn.put(n-3, M(n-3));
            total += mn.get(n-3);

            return total;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for(int i = 0; i < cases; i++) {
            int n = scan.nextInt();
            System.out.println("Case " + (i+1) + ": M(" + n + ") =" + M(n));
        }
        scan.close();
    }
}
