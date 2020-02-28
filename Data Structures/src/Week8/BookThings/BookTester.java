package Week8.BookThings;

public class BookTester {

    public static void main(String[] args) {
        Book hungerGames  = new Book("Hunger Games", "S. Collins", 15);
        hungerGames.changePrice(1);
        System.out.println(hungerGames);

        Textbook bigJava =
                new Textbook("Big Java", "C. Horstmann", 150, "Computer Science");
        bigJava.changePrice(30);
        System.out.println(bigJava);
        bigJava.addResource("web1");
//        System.out.println(bigJava);
//        bigJava.addResource("web" + "1");
//        System.out.println(bigJava);


        Book theBook = bigJava;
        theBook.changePrice(10);
        System.out.println(theBook);
        //theBook.addResource("web2");

       // Textbook theTextBook = hungerGames;
    }
}
