package CreationalPatterns.GoF.Builder.InterfaceBuilder1;

import CreationalPatterns.GoF.Builder.Model.*;

public interface InterfaceBuilder {

    void start();
    void buildBase();
    void addWidget();
    void insertDoohickey();
    void end();

    ComplexObject getComplexObject();
}
