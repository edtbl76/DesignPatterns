package StructuralPatterns.GoF.Bridge;

public abstract class Server {

    /*
        By overloading the constructor we support composition via setter, or we can initialize the object w/
        a state.
     */
    protected ServerState state;

    public Server() {}

    public Server(ServerState state) {
        this.state = state;
    }

    public ServerState getState() {
        return state;
    }

    public void setState(ServerState state) {
        this.state = state;
    }

    public void change() {
        System.out.print("Setting Server State to :");
        state.change();

    }

    public void check() {
        System.out.print("\t" + this.getClass().getSimpleName());
        state.check();
    }
}
