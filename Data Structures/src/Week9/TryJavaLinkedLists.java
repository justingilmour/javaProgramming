package Week9;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class TryJavaLinkedLists {

    public static void main(String[] args) {
        LinkedList<Double> doubleList = new LinkedList<>();

        doubleList.add(10.1);
        doubleList.add(11.2);
        doubleList.add(14.5);
        System.out.println(doubleList);
        doubleList.add(2,12.8);
        System.out.println(doubleList);
        doubleList.add(0,100.1);
        ListIterator<Double> listIter = doubleList.listIterator();
        Iterator<Double> iter = doubleList.iterator();
        //Using Iterator
        while(iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }
        System.out.println();

        //Using ListIterators
        while (listIter.hasNext()) {
            System.out.print(listIter.next() + " ");
        }
        System.out.println();
        //Backwards with listIter
        while (listIter.hasPrevious()) {
            System.out.print(listIter.previous() + " ");
        }
        System.out.println();

        Double x = 0.0;
        while (listIter.hasNext()) {
            x = listIter.next();
            x = x + 5.2;
            listIter.remove();
            listIter.add(x);
        }
        System.out.println(doubleList);



    }
}
