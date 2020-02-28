package Week8.BookThings;

import java.util.ArrayList;

public class Textbook extends Book {

    //instance variable
    private String subject;
    private ArrayList<String> resourceLst;

    //constructor
    public Textbook(String title, String author, double price, String subject) {
        super(title,author,price);
        this.subject = subject;
        resourceLst = new ArrayList<>();
    }
    @Override
    public void changePrice(double update) {
            super.changePrice(update + update* .1);
    }

    public void addResource(String newResource) {
        if (!resourceLst.contains(newResource)) {
            resourceLst.add(newResource);
        }
    }


    @Override
    public String toString() {
        String out = super.toString();
        out = out + " subject is " + subject + " and resource list is ";
        out += resourceLst;
        return out;
    }
}
