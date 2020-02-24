package Week6.Books;

import java.util.ArrayList;

public class Textbook extends Book {

    private String subject;
    private ArrayList<String> resourceLst;

    public Textbook(String title, String author, double price, String subject){
        super(title, author, price);
        this.subject = subject;
        resourceLst = new ArrayList<>();
    }

    public void changePrice(double update) {
        super.changePrice(update + update *.1);
    }

    public void addResource(String newResource) {
        if (!resourceLst.contains(newResource)) {
            resourceLst.add(newResource);
        }
    }

    @Override
    public String toString(){
        String out = super.toString();
        out = out + " subject is " + subject + " and resource list is " + resourceLst;
        out += resourceLst;
        return out;
    }
}
