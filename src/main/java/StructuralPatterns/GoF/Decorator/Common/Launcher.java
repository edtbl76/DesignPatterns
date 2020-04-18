package StructuralPatterns.GoF.Decorator.Common;

public class Launcher {

    public static void main(String[] args) {

        /*
            Starting point. This is just your everyday features
         */
        System.out.println(" --- Component W/O Decorator --- ");
        ConcreteComponent componentWithoutDecorator = new ConcreteComponent();
        componentWithoutDecorator.method();

        /*
            We add a decorator
            - first, you'll remember that the decorator's method() call is delegating to the component's method() call
            - second, you'll notice that we don't impact the existing functionality at all.
         */
        System.out.println(" --- Adding One Decorator --- ");
        FeatureOneDecorator featureOneDecorator = new FeatureOneDecorator();
        featureOneDecorator.setComponent(componentWithoutDecorator);
        featureOneDecorator.method();

        /*
            We add ANOTHER decorator.
            - NOTE: we accept the previous decorator as the "Component" of the new decorator.
            - Since the Decorator only takes a component as an argument, the Decorator must act as a Component.
            (This happens in the AbstractDecorator, which extends the Component)
         */
        System.out.println(" --- Adding Second Decorator --- ");
        FeatureTwoDecorator featureTwoDecorator = new FeatureTwoDecorator();
        featureTwoDecorator.setComponent(featureOneDecorator);
        featureTwoDecorator.method();
    }
}
