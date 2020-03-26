package CreationalPatterns.TheClassics.AbstractFactory.Common;

import CreationalPatterns.TheClassics.AbstractFactory.Models.*;

public interface AbstractAnimalFactory {

    /*
        We're only establishing the CREATOR methods for concrete classes.
     */
    Canine createCanine();
    Feline createFeline();
}
