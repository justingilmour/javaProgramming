package Week5;

import java.util.ArrayList;

public class ArrayLists {
//    public static void main(String[] args) {
//        ArrayList<Double> list1 = new ArrayList<>();
//        list1.add(5.5);
//        list1.add(10.2);
//        list1.add(12.4);
//        System.out.println(list1);

    public static void main(String[] args) {
        ArrayList<Double> list1 = new ArrayList<>();
        list1.add(5.1);
        list1.add(6.1);
        list1.add(7.1);
        list1.add(8.1);

        ArrayList<Double> list2 = new ArrayList<>();
        list2.add(6.2);
        list2.add(7.9);

        for (int i = 0; i < list1.size(); i++){
            list2.add(i, list1.get(i));
        }
        System.out.println(list2);
    }

    }


