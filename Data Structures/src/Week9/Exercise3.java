package Week9;
import java.util.List;
import java.util.LinkedList;

public class Exercise3 {
    public static void main(String[] args) {
        List<String> test = new LinkedList<>();
        test.add("how");
        test.add("are");
        test.add("you");
        System.out.println(test);
        test.set(test.size()-1, "cow");
        test.set(test.size()-2, "brown");
        System.out.println(test);

        //Wrote a for-each loop to print items
        for (String element : test){
            System.out.println(element);
        }

        //for loop
        for (int i = 0; i < test.size(); i++){
            System.out.println(test.get(i));
        }

        //Make a copy of a linked list
//        List<String> test2 = new LinkedList<>();
//        for (String)

        // try ==
        //try .equals

        //Try Remove methods
        LinkedList<Integer> lst3 = new LinkedList<>();
        lst3.add(2);
        lst3.add(4);
        lst3.add(6);
        lst3.add(4);
        lst3.add(2);
        System.out.println(lst3);
        lst3.remove(2);
        lst3.remove((Integer) 2);
        System.out.println(lst3);
//        while(lst3.contains((Integer)2))
//            lst3.remove((Integer)2);
//        System.out.println(lst3);
        //lst3.remove(10);



    }




}
