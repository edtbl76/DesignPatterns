package CreationalPatterns.TheClassics.FactoryMethod.SimpleFactoryMethod1;

import CreationalPatterns.TheClassics.FactoryMethod.Models.*;

public class SimpleClassOneFactory extends SimpleParentFactory {

    /*
        This is the subclass of the Factory that decides what type of SimpleParent its going to create
     */
    @Override
    public SimpleParent createSimpleParent() {
        return new SimpleClassOne();
    }
}
