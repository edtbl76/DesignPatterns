package CreationalPatterns.TheClassics.AbstractFactory.ParameterizedConstructors;

import CreationalPatterns.TheClassics.AbstractFactory.Models.*;

public class Launcher {

    public static void main(String[] args) {

        /*
            This example is the same as in Common, but we are providing an input parameter in order to instantiate
            the objects.
         */

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
        canine = factory.createCanine(AnimalCoat.GREY);
        canine.speak();
        canine.act();

        System.out.println("----- Lion -----");
        feline = factory.createFeline(AnimalCoat.GOLD);
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
        canine = factory.createCanine(AnimalCoat.TRICOLOR);
        canine.speak();
        canine.act();

        System.out.println("----- TabbyCat -----");
        feline = factory.createFeline(AnimalCoat.ROADKILL);
        feline.speak();
        feline.act();
    }
}
