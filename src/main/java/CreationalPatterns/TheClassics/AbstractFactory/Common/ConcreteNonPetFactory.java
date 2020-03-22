package CreationalPatterns.TheClassics.AbstractFactory.Common;

import CreationalPatterns.TheClassics.AbstractFactory.Models.*;

public class ConcreteNonPetFactory implements AbstractAnimalFactory {

    @Override
    public Canine createCanine() {
        return new Wolf();
    }

    @Override
    public Feline createFeline() {
        return new Lion();
    }
}
