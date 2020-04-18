package CreationalPatterns.GoF.AbstractFactory.SimpleImplementation;

import CreationalPatterns.GoF.AbstractFactory.Models.*;

public interface AbstractAnimalFactory {

    /*
        We're only establishing the CREATOR methods for concrete classes.
     */
    Canine createCanine();
    Feline createFeline();
}
