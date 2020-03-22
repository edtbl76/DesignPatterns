package TheClassics.CreationalPatterns.Builder.InterfaceBuilder1;

import TheClassics.CreationalPatterns.Builder.Model.*;

public interface InterfaceBuilder {

    void start();
    void buildBase();
    void addWidget();
    void insertDoohickey();
    void end();

    ComplexObject getComplexObject();
}
