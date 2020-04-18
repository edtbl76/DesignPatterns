package StructuralPatterns.GoF.Bridge;

public class StopServer implements ServerState {

    /*
        Concrete Implementor that represents a "STOP" option
     */
    @Override
    public void change() {
       System.out.print("STOP\n");
    }

    @Override
    public void check() {
        System.out.println(" stopped");
    }
}
