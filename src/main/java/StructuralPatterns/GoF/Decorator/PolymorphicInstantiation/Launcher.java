package StructuralPatterns.GoF.Decorator.PolymorphicInstantiation;

import StructuralPatterns.GoF.Decorator.Common.*;

@SuppressWarnings("Duplicates")
public class Launcher {

    public static void main(String[] args) {

        System.out.println(" --- Component W/O Decorator --- ");
        ConcreteComponent componentWithoutDecorator = new ConcreteComponent();
        componentWithoutDecorator.method();

        /*
            Same as the previous example, but we are providing a polymorphic instantiation of the decorators.
         */
        System.out.println(" --- Adding One Decorator --- ");
        AbstractDecorator featureOneDecorator = new FeatureOneDecorator();
        featureOneDecorator.setComponent(componentWithoutDecorator);
        featureOneDecorator.method();

        System.out.println(" --- Adding Second Decorator --- ");
        AbstractDecorator featureTwoDecorator = new FeatureTwoDecorator();
        featureTwoDecorator.setComponent(featureOneDecorator);
        featureTwoDecorator.method();
    }
}
