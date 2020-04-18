package CreationalPatterns.GoF.AbstractFactory.Models;

public class HoundDog implements Canine {

    public HoundDog() {}

    public HoundDog(AnimalCoat coat) {
        System.out.println("I'm a hound dog with a " + coat.toString().toLowerCase() + " coat");
    }

    @Override
    public void speak() {
        // Beagle or Hound owners know what this means :)
        System.out.println("Hounds give voice or bay.");
    }

    @Override
    public void act() {
        System.out.println("Hounds hog up the couch");
    }
}
