package StructuralPatterns.GoF.Bridge;

public class RunServer implements ServerState {

    /*
        Concrete Implementor that represents a "RUN" option
     */
    @Override
    public void change() {
       System.out.print("RUN\n");
    }

    @Override
    public void check() {
        System.out.println(" running");
    }
}
