package StructuralPatterns.TheClassics.Facade;

public class Facade {

    private CoreObject core;
    private Listener listener;
    private Application application;

    public Facade() {
        core = new CoreObject();
        listener = new Listener();
        application = new Application();
    }

    /*
        The next two methods follow the same start up pattern.

        1. create a static object that is shared by all instances of type one applications.
        2. explicitly set the type of listener and application we want to use. (Order doesn't matter)
        3. start them (order matters)
     */
    public void bootstrapTypeOne() {
        CoreObject.startCore();

        System.out.println("Starting TypeOne Subsystem");
        application.setThingOne();
        listener.setListenerTypeOne();

        core.startListeners();
        core.startTheRest();
        System.out.println("TypeOne Subsystem Running\n");
    }

    public void bootstrapTypeTwo() {
        CoreObject.startCore();

        System.out.println("Starting TypeTwo Subsystem");
        application.setThingTwo();
        listener.setListenerTypeTwo();

        core.startListeners();
        core.startTheRest();
        System.out.println("TypeTwo Subsystem Running\n");
    }

    /*
       The next two methods follow the same start up pattern.

        1. create a static object that is shared by all instances of type one applications.
        2. explicitly set the type of listener and application we want are shutting down. (Order doesn't matter)
        3. stop them (order matters)
     */
    public void shutdownTypeOne() {
        CoreObject.stopCore();

        System.out.println("Stopping TypeOne Subsystem");
        application.unsetThingOne();
        listener.removeListenerTypeOne();

        core.stopTheRest();
        core.stopListeners();
        System.out.println("TypeOne Subsystem stopped\n");
    }

    public void shutdownTypeTwo() {
        CoreObject.stopCore();

        System.out.println("Stopping TypeTwo Subsystem");
        application.unsetThingTwo();
        listener.removeListenerTypeTwo();

        core.stopTheRest();
        core.stopListeners();
        System.out.println("TypeTwo Subsystem Stopped\n");
    }

}
