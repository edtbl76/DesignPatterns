package StructuralPatterns.TheClassics.Facade;

public class Listener {

    public void setListenerTypeOne() {
        System.out.println("I'm the listener type one. I work with thing one applications");
    }

    public void setListenerTypeTwo() {
        System.out.println("I'm the listener type two. I work with thing two applications");
    }

    public void removeListenerTypeOne() {
        System.out.println("Removing type one listeners!");
    }

    public void removeListenerTypeTwo() {
        System.out.println("Removing type two listeners!");
    }
}
