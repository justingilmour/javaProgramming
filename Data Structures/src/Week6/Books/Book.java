package Week6.Books;

import javax.swing.*;

public class Book {

    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price){
        this.title = title;
        this.author = author;
        this. price = price;
    }

    public Book(double price){

    }

    public String toString() {
        return title + " by " + author + " costs $" + price;
    }
}
