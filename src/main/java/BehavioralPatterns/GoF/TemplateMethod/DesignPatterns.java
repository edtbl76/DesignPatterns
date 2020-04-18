package BehavioralPatterns.GoF.TemplateMethod;

import java.util.Arrays;
import java.util.List;

public abstract class DesignPatterns {

    private final static List<String> CREATIONAL =
            Arrays.asList("AbstractFactory", "Builder", "FactoryMethod", "Prototype", "Singleton");
    private final static List<String> STRUCTURAL =
            Arrays.asList("Adapter", "Bridge", "Composite", "Decorator", "Facade", "Flyweight", "Proxy");
    private final static List<String> BEHAVIORAL =
            Arrays.asList("Chain of Responsibility", "Command", "Interpreter", "Iterator", "Mediator", "Memento",
                    "Observer", "State", "Strategy", "TemplateMethod", "Visitor");


    // Structure is final to prevent override
    public final void complete() {

        // Common Methods
        completeCreationalPatterns();
        completeStructuralPatterns();
        completeBehavioralPatterns();

        // hooks
        if (isUndergrad()) {
            completeUndergradRequirements();
        }

        // Specialized
        completeFinalProject();
    }

    private void completeCreationalPatterns() {
        System.out.println(" --- Creational Patterns --- ");
        CREATIONAL.forEach(s -> System.out.println("\t" + (CREATIONAL.indexOf(s) + 1) + ".) " + s));
    }

    private void completeStructuralPatterns() {
        System.out.println(" --- Structural Patterns --- ");
        STRUCTURAL.forEach(s -> System.out.println("\t" + (STRUCTURAL.indexOf(s) + 1) + ".) " + s));
    }

    private void completeBehavioralPatterns() {
        System.out.println(" --- Behavioral Patterns --- ");
        BEHAVIORAL.forEach(s -> System.out.println("\t" + (BEHAVIORAL.indexOf(s) + 1) + ".) " + s));
    }

    public abstract void completeFinalProject();


    private void completeUndergradRequirements() {
        System.out.println("Undergraduates have to learn the principles of Object-Oriented Programmin!");
    }

    boolean isUndergrad() {
        return true;
    }

}
