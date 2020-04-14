package Week9;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class CompareEfficiency {
    public static void main(String[] args) {
        int length = 100000;
        List<String> llList = new LinkedList<String>();
        llList.add("Dopey");
        System.out.println("Start LinkedList");
        for (int i = 0; i < length; i++) llList.add(0,"Bashful");
        System.out.println("LinkedListDone");

        List<String> alList = new ArrayList<String>(length);
        alList.add("Dopey");
        System.out.println("Start ArrayList");
        for (int i = 0; i < length; i++) alList.add(0,"Bashful");
        System.out.println("ArrayListDone");

        System.out.println("Start Linked List Access");
        for (int i = 0; i < length; i++)
            llList.get((int)(length * Math.random()));
        System.out.println("LinkedListDoneAccessing");

        System.out.println("Start Array List Access");
        for (int i = 0; i < length; i++)
            alList.get((int)(length * Math.random()));
        System.out.println("ArrayListDoneAccessing");

    }
}
