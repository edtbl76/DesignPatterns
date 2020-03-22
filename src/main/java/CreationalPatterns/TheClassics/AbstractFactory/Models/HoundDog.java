package CreationalPatterns.TheClassics.AbstractFactory.Models;

public class HoundDog implements Canine {
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
