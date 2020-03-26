package CreationalPatterns.TheClassics.AbstractFactory.Models;

public class Wolf implements Canine {

    public Wolf() {}

    public Wolf(AnimalCoat coat) {
        System.out.println("I'm a wolfie with a " + coat.toString().toLowerCase() + " coat");
    }

    @Override
    public void speak() {
        System.out.println("Wolves howl at the moon.");
    }

    @Override
    public void act() {
        System.out.println("Wolves scavenge and hunt with the pack.");
    }
}
