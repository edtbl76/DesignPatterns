package StructuralPatterns.TheClassics.Bridge;

import java.util.Arrays;
import java.util.List;

public class Launcher {

    public static void main(String[] args) {

        /*
            I'm building our "implementation" objects.
         */
        ServerState runState = new RunServer();
        ServerState offState = new StopServer();


        /*
            Start our Database Server
            - I've chosen to initialize the DB Server with a run state. (This is eager, which might make sense
            for a database server, because we have a bunch of setup required)
         */

        Server db = new DatabaseServer(runState);
        db.change();

        /*
            Start our Web Server
            - here we set it lazily. It doesn't really make sense though, because it will be off by default.
            - crappy example alert.
         */
        Server web = new WebServer();
        web.setState(offState);
        web.change();

        // Build a list and check states
        List<Server> servers = Arrays.asList(web, db);
        checkStates(servers);

        /*
            Enable Server
         */
        System.out.println(" --- Turning on Web Server --- ");
        web.setState(runState);
        web.change();

        // check states
        checkStates(servers);

        // DB CRASHES (Oh no!), followed by check state, autostart and confirmation
        /*
            This is represents the power of the Bridge Pattern.
            Our abstractions are defined polymorphically as "Servers".

            However, when we need to use autoStart(), which only exists in the DatabaseServer() (refined abstraction)
            we can change the abstraction AT RUNTIME by casting.

            Most inspections/IDE are going to recommend narrowing the above declaration's variable type to DatabaseServer
            in the first place, but nonetheless this is one of the powers of the Bridge pattern.

         */
        db.setState(new StopServer());
        checkStates(servers);
        ((DatabaseServer) db).autoStart();
        checkStates(servers);



    }

    public static void checkStates(List<Server> list) {
        System.out.println(" --- Checking States --- ");
        list.forEach(Server::check);
    }
}
