package CreationalPatterns.TheClassics.AbstractFactory.Models;

public class TabbyCat implements Feline {

    @Override
    public void speak() {
        System.out.println("Cats meow.");
    }

    @Override
    public void act() {
        System.out.println("Cats poop in a litterbox.");
    }
}
