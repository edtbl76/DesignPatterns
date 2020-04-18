package StructuralPatterns.GoF.Bridge;

public interface ServerState {

    /*
        Implementor Interface
     */
    void change();
    void check();
}
