package Week3;

import java.util.Arrays;

public class PetTester {

    public static void main(String[] args) {
        Pet myPet = new Pet("Fido", "dog");
        myPet.timesPetting(3);
        System.out.println(myPet);

        Pet myPet2 = new Pet("Luna", "cat");
        myPet2.timesPetting(3);
        System.out.println(myPet2);

        Pet[] petArray = new Pet[5];
        petArray[0] = myPet;
        petArray[1] = new Pet("Scooter", "dog");
        petArray[2] = new Pet("Cassie", "cat");

        System.out.println(Arrays.toString(petArray));


        Pet.getNumberOfPets();
    }
}
