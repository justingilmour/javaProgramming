package Week8.BookThings;

public class Book {

    //instance variable
    private String title;
    private String author;
    private double price;

    //constructor
    public Book(String title, String auth, double price) {
        this.title = title;
        author = auth;
        this.price = price;
    }

    public double returnPrice() {
        return price;
    }

    public void changePrice(double update) {
        price += update;

    }

    @Override
    public String toString() {
        return title + " by " + author + " costs $" + price;
    }
}
