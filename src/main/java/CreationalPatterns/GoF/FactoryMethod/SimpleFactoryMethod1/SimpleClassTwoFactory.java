package CreationalPatterns.GoF.FactoryMethod.SimpleFactoryMethod1;

import CreationalPatterns.GoF.FactoryMethod.Models.*;

public class SimpleClassTwoFactory extends SimpleParentFactory {
    @Override
    public SimpleParent createSimpleParent() {
        return new SimpleClassTwo();
    }
}
