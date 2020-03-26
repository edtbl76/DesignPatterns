package CreationalPatterns.TheClassics.AbstractFactory.Models;

public class Lion implements Feline {

    public Lion() {}

    public Lion(AnimalCoat coat) {
        System.out.println("I'm a lion with a " + coat.toString().toLowerCase() + " coat");
    }

    @Override
    public void speak() {
        System.out.println("Lions roar.");
    }

    @Override
    public void act() {
        System.out.println("Lions eat antelope.");
    }
}
