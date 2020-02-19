package Week4;

public class Monday {
    public static void main(String[] args) {
        int total = 1;
        for (int count = 1; count <= 100; count++){
            total *= count;
        }
        System.out.println(total);

        String outStr = "";
        for (int count = 1; count <= 10; count++){
            outStr += count;
        }
        System.out.println(outStr);
    }
}
