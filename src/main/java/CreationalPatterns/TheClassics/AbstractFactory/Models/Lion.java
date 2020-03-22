package CreationalPatterns.TheClassics.AbstractFactory.Models;

public class Lion implements Feline {
    @Override
    public void speak() {
        System.out.println("Lions roar.");
    }

    @Override
    public void act() {
        System.out.println("Lions eat antelope.");
    }
}
