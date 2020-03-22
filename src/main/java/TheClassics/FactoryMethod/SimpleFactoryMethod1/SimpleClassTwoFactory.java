package TheClassics.FactoryMethod.SimpleFactoryMethod1;

import TheClassics.FactoryMethod.Models.*;

public class SimpleClassTwoFactory extends SimpleParentFactory {
    @Override
    public SimpleParent createSimpleParent() {
        return new SimpleClassTwo();
    }
}
