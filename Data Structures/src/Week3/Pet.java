package Week3;

public class Pet {

    public static int totalPets = 0;

    //instance variables
    private String name;
    private String type;
    private int numberOfTimesPetted;

    //constructor
    public Pet(String petName, String petType) {
        name = petName;
        type  = petType;
        numberOfTimesPetted = 0;
        Pet.totalPets++;
    }

    public Pet(String petName, String petType, int numberOfTimesPetted) {
        name = petName;
        type = petType;
        numberOfTimesPetted = numberOfTimesPetted;
    }

    public Pet copy() {
        return new Pet(name, type, numberOfTimesPetted);
    }

    //other methods
    public void timesPetting(int number) {
        numberOfTimesPetted += number;
    }

    //output
    public String toString() {
        String out = "Pet's name is " + name + " pet type is " + type;
        out += " has been petted " + numberOfTimesPetted;
        return out;
    }

    public static void getNumberOfPets() {
        System.out.println(Pet.totalPets);
    }
}
