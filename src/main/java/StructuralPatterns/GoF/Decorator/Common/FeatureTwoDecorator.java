package StructuralPatterns.GoF.Decorator.Common;

public class FeatureTwoDecorator extends AbstractDecorator {

    @Override
    public void method() {
        super.method();

        /*
            Decoration code
         */
        addMyFeature();
    }

    /*
        I cheated here, so that I could just copy and paste the same code over and over to demonstrate that we can
        just keep on keepin' on with respect to adding Decorators
     */
    private void addMyFeature() {
        System.out.println("Adding feature from: " + getClass().getSimpleName());
    }
}
