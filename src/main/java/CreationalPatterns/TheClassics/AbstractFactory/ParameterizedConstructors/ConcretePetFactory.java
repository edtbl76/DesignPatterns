package CreationalPatterns.TheClassics.AbstractFactory.ParameterizedConstructors;

import CreationalPatterns.TheClassics.AbstractFactory.Models.*;

public class ConcretePetFactory implements AbstractAnimalFactory{

    /*
        This is the same as before, but we are using a parameterized constructor.
        - This is kind of a silly example, but it illustrates some dependency on which creation depends.

        There are typically two ways we can obtain this kind of information
        1.) The information can be input driven (like this example)
            - this may be information that is provided directly from a user (depending on how close the service is to the
        front end), or it may be populated by a system call from a middleware service (depending on how close the
        service is to the BACK end)

        2.) Information can also be preconfigured through an init() method that is called from an empty constructor (
        or just a constructor that doesnt' specify parameters for the given information).

        - in these examples initialization can come from a stored configuration, or if creation is performed lazily,
        we'll obtain the information dynamically from some incoming source.

     */
    @Override
    public Canine createCanine(AnimalCoat animalCoat) {
        return new HoundDog(animalCoat);
    }

    @Override
    public Feline createFeline(AnimalCoat animalCoat) {
        return new TabbyCat(animalCoat);
    }
}
