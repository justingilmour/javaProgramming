package Week3;

public class OOP {

    //instance variables
    private double radius;
    //constructor
    public OOP(double rad) {
        this.radius = rad;
    }

    //other methods
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    // output method
    public String toString() {
        return "Circle with radius "+ radius;
    }
}
