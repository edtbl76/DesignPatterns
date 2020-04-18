package StructuralPatterns.GoF.Facade;

public class Application {

    public void setThingOne() {
        System.out.println("I'm the thing one application");
    }

    public void setThingTwo() {
        System.out.println("I'm the thing two application");
    }

    public void unsetThingOne() {
        System.out.println("Shutting down thing one");
    }

    public void unsetThingTwo() {
        System.out.println("Shutting down thing two");
    }
}
