package CreationalPatterns.TheClassics.AbstractFactory.Common;

import CreationalPatterns.TheClassics.AbstractFactory.Models.*;

public class ConcretePetFactory implements AbstractAnimalFactory{
    @Override
    public Canine createCanine() {
        return new HoundDog();
    }

    @Override
    public Feline createFeline() {
        return new TabbyCat();
    }
}
