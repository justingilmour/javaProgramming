package Week3;

public class Cylinder {

    private double height;
    private OOP base;


    public Cylinder(OOP base, double hgt) {
        this.base = base;
        height = hgt;
    }

    public double cylinderVolume() {
        return base.calculateArea() * height;
    }

    public String toString() {
        return "Cylinder with base " + base + " and height " + height;
    }
}
