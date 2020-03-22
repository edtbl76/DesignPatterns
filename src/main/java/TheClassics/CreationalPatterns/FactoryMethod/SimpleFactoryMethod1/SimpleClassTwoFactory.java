package TheClassics.CreationalPatterns.FactoryMethod.SimpleFactoryMethod1;

import TheClassics.CreationalPatterns.FactoryMethod.Models.*;

public class SimpleClassTwoFactory extends SimpleParentFactory {
    @Override
    public SimpleParent createSimpleParent() {
        return new SimpleClassTwo();
    }
}
