package Week3;

public class CircleTester {
    public static void main(String[] args) {
        OOP myCircle = new OOP(4);
        System.out.println(myCircle);
        System.out.println(myCircle.calculateArea());

        Cylinder myCylinder = new Cylinder(myCircle, 2);
        System.out.println(myCylinder);
        System.out.println(myCylinder.cylinderVolume());

    }
}
