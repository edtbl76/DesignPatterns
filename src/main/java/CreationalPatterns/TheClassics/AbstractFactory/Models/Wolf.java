package CreationalPatterns.TheClassics.AbstractFactory.Models;

public class Wolf implements Canine {
    @Override
    public void speak() {
        System.out.println("Wolves howl at the moon.");
    }

    @Override
    public void act() {
        System.out.println("Wolves scavenge and hunt with the pack.");
    }
}
