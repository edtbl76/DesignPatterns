package CreationalPatterns.GoF.AbstractFactory.SimpleImplementation;

import CreationalPatterns.GoF.AbstractFactory.Models.*;

public class ConcretePetFactory implements AbstractAnimalFactory{


    /*
        This concrete factory provides implementations of CREATOR methods that instantiate a new animal grouped
        from the "pet" category.
     */
    @Override
    public Canine createCanine() {
        return new HoundDog();
    }

    @Override
    public Feline createFeline() {
        return new TabbyCat();
    }
}
