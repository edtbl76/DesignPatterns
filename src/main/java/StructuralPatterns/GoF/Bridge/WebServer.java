package StructuralPatterns.GoF.Bridge;

public class WebServer extends Server {

    /*
      This is a refined abstraction that isn't going to change any of the
      default implementations.
   */

    public WebServer() { }

    public WebServer(ServerState state) { super(state); }
}
