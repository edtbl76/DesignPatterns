package StructuralPatterns.GoF.Facade;

public class CoreObject {

    public static void startCore() {
        System.out.println("Start core object. I have to come first!");
    }

    public void startListeners() {
        System.out.println("I am a complicated subsystem of listeners.");
    }

    public void startTheRest() {
        System.out.println("Now that the core and listeners are created, I can start everything else");
    }

    public static void stopCore() {
        System.out.println("Initializing shutdown");
    }

    public void stopListeners() {
        System.out.println("Stopping complicated subsystem of listeners");
    }

    public void stopTheRest() {
        System.out.println("Stopping applications.");
    }
}
