package StructuralPatterns.TheClassics.Bridge;

public class DatabaseServer extends Server {

    /*
        This is a refined abstraction that isn't going to change any of the
        default implementations.
     */
    public DatabaseServer() {
    }

    public DatabaseServer(ServerState state) {
        super(state);
    }

    public void autoStart() {
        if (state.getClass() == StopServer.class) {
            System.out.println("Database in Stopped State. AutoStart!");
            state = new RunServer();
            state.change();
        } else {
           state.check();
        }
    }
}
