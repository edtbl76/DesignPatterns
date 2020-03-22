package CreationalPatterns.TheClassics.Builder.Model;

import java.util.*;

public class ComplexObject {

    private LinkedList<String> components;

    public ComplexObject() {
        components = new LinkedList<>();
    }

    public void add(String component) {
        components.addLast(component);
    }

    public void print() {
        System.out.println("ComplexObject: ");
        System.out.println("\t" + String.join("::", components).replace(" ", "-"));
    }
}
