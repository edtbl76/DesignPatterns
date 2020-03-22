package CreationalPatterns.TheClassics.Builder.InterfaceBuilder1;

import CreationalPatterns.TheClassics.Builder.Model.*;

public interface InterfaceBuilder {

    void start();
    void buildBase();
    void addWidget();
    void insertDoohickey();
    void end();

    ComplexObject getComplexObject();
}
