package StructuralPatterns.GoF.Decorator.Common;

public class FeatureOneDecorator extends AbstractDecorator {

    @Override
    public void method() {
        super.method();

        /*
            Decoration code
         */
        addMyFeature();
    }

    private void addMyFeature() {
        System.out.println("Adding feature from: " + getClass().getSimpleName());
    }
}
