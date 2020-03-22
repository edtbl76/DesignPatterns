package CreationalPatterns.TheClassics.FactoryMethod.SimpleFactoryMethod1;

import CreationalPatterns.TheClassics.FactoryMethod.Models.*;

public class SimpleClassTwoFactory extends SimpleParentFactory {
    @Override
    public SimpleParent createSimpleParent() {
        return new SimpleClassTwo();
    }
}
