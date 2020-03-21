package TheClassics.Builder.AbstractBuilder;

import TheClassics.Builder.Model.*;

public abstract class AbstractBuilder {

    protected ComplexObject object;


    /*
        Default methods that we keep here.
     */
    public void build() {
        object = new ComplexObject();
    }

    public void addWidget() {
        object.add("Widgetron");
    }

    public void insertDoohickey() {
        object.add("Doohickey");
    }

    public ComplexObject getComplexObject() {
        return object;
    }

    /*
        Abstract methods that have to be implemented.
     */
    public abstract void start();
    public abstract void buildBase();
    public abstract void end();


}
