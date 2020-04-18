package CreationalPatterns.GoF.AbstractFactory.SimpleImplementation;

import CreationalPatterns.GoF.AbstractFactory.Models.*;

public class Launcher {

    public static void main(String[] args) {

        // Do some setup
        AbstractAnimalFactory factory;
        Canine canine;
        Feline feline;

        /*
            Select the factory we are going to use.
         */
        factory = new ConcreteNonPetFactory();


        /*
            Create our "nonpet" type animals.
         */
        System.out.println("----- Wolf -----");
        canine = factory.createCanine();
        canine.speak();
        canine.act();

        System.out.println("----- Lion -----");
        feline = factory.createFeline();
        feline.speak();
        feline.act();


        /*
            NOTE: We are changing the underlying factory... (Factory of Factories!)
         */
        factory = new ConcretePetFactory();

        /*
            Create our "Pet type animals"
         */
        System.out.println("----- HoundDog -----");
        canine = factory.createCanine();
        canine.speak();
        canine.act();

        System.out.println("----- TabbyCat -----");
        feline = factory.createFeline();
        feline.speak();
        feline.act();
    }
}
