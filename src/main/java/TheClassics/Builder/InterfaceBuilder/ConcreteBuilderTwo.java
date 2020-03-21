package TheClassics.Builder.InterfaceBuilder;

import TheClassics.Builder.Model.*;

public class ConcreteBuilderTwo implements InterfaceBuilder {

    private String name;
    private ComplexObject object;

    public ConcreteBuilderTwo(String name) {
        object = new ComplexObject();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void start() {
        // empty
    }

    @Override
    public void buildBase() {
        object.add("Pavement");
    }

    @Override
    public void addWidget() {
        object.add("Widgetorious");
    }

    @Override
    public void insertDoohickey() {
        object.add("42 Doohickeys");
    }

    @Override
    public void end() {
        // Finish with name
        object.add(String.format("Name[%s]", this.name));
    }

    @Override
    public ComplexObject getComplexObject() {
        return object;
    }
}
