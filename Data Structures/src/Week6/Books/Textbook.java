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

    @Override
    public String toString(){
        String out = super.toString();
        out = out + " subject is " + subject + " and resource list is " + resourceLst;
        return out;
    }
}
