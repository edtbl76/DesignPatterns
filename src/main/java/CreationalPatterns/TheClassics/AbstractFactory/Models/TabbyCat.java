package CreationalPatterns.TheClassics.AbstractFactory.Models;

public class TabbyCat implements Feline {

    public TabbyCat() {}

    public TabbyCat(AnimalCoat coat) {
        System.out.println("I'm a kitty cat with a " + coat.toString().toLowerCase() + " coat");
    }

    @Override
    public void speak() {
        System.out.println("Cats meow.");
    }

    @Override
    public void act() {
        System.out.println("Cats poop in a litterbox.");
    }
}
