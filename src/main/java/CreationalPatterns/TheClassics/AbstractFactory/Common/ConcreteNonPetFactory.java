package CreationalPatterns.TheClassics.AbstractFactory.Common;

import CreationalPatterns.TheClassics.AbstractFactory.Models.*;

public class ConcreteNonPetFactory implements AbstractAnimalFactory {

    /*
        HERE we have defined implementation for non-pet types associated with each CREATOR method.
        This Factory creates a version of any kind of object that is considered a non-pet.
     */
    @Override
    public Canine createCanine() {
        return new Wolf();
    }

    @Override
    public Feline createFeline() {
        return new Lion();
    }
}
