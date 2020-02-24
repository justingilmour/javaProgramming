package Week6.Books;

public class BookTester {

    public static void main(String[] args) {
        Book hungerGames = new Book ("Hunger Games", "S. Collins", 15);
        System.out.println(hungerGames);

        Textbook bigJava = new Textbook("Big Java", "C. Hortsmann", 150, "Computer Science");
        bigJava.changePrice(30);
        System.out.println(bigJava);
        bigJava.addResource("web1");
        System.out.println(bigJava);

        Book theBook = bigJava;
        theBook.changePrice(10);
        System.out.println(theBook);

    }
}
