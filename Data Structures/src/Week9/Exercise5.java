package javaLinkedLists;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Exercise5 {

    public static void swapNumbers(List<Integer> list, int num1, int num2) {
        if (list.contains(num1) && list.contains(num2)) {
            int index1 = list.indexOf(num1);
            int index2 = list.indexOf(num2);
            list.set(index1, num2);
            list.set(index2, num1);
        }
    }

    public static void main(String[] args) {
        Integer[] x = {1,2,3,4,5};
        List<Integer> lst = new ArrayList<>(Arrays.asList(x));
       // List<Integer> lst = new LinkedList<>(Arrays.asList(x));
        System.out.println(lst);
        swapNumbers(lst, 2,4);
        System.out.println(lst);
    }
}
