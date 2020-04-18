package CreationalPatterns.GoF.FactoryMethod.SimpleFactoryMethod1;

import CreationalPatterns.GoF.FactoryMethod.Models.*;

public class SimpleClassOneFactory extends SimpleParentFactory {

    /*
        This is the subclass of the Factory that decides what type of SimpleParent its going to create
     */
    @Override
    public SimpleParent createSimpleParent() {
        return new SimpleClassOne();
    }
}
