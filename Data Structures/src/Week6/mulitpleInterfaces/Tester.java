package Week6.mulitpleInterfaces;

/**
 * Created by Owner on 2/19/2017.
 */

public class Tester implements interface1, interface2{

    public void foo(String input) {
        System.out.println("three : " + input);
    }

    public static void main(String[] args) {
        Tester x = new Tester();
        x.foo("hi");
    }


}
