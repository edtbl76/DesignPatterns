package CreationalPatterns.TheClassics.AbstractFactory.Common;

import CreationalPatterns.TheClassics.AbstractFactory.Models.*;

public interface AbstractAnimalFactory {

    Canine createCanine();
    Feline createFeline();
}
