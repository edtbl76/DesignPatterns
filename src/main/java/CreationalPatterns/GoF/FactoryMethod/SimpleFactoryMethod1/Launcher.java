package CreationalPatterns.GoF.FactoryMethod.SimpleFactoryMethod1;

import CreationalPatterns.GoF.FactoryMethod.Models.*;

public class Launcher {

    public static void main(String[] args) {

        /*
            We instantiate a factory class.
            We then create a class using the factory
            We call its methods
         */
        SimpleParentFactory classOne = new SimpleClassOneFactory();
        SimpleParent classOneInstance = classOne.createSimpleParent();
        classOneInstance.doAction();
        classOneInstance.doOtherAction();

        SimpleParentFactory classTwo = new SimpleClassTwoFactory();
        SimpleParent classTwoInstance = classTwo.createSimpleParent();
        classTwoInstance.doAction();
        classTwoInstance.doOtherAction();

    }
}
