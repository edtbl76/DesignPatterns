package StructuralPatterns.GoF.Facade;

public class Launcher {
    public static void main(String[] args) {

        /*
            This should demonstrate the ease of instantiating complex subsystems.
            1. we're going to create our objects, followed by their instantiation
            2. we're going to stop them.
         */

        Facade typeOneSubsystem = new Facade();
        typeOneSubsystem.bootstrapTypeOne();

        Facade typeTwoSubsystem = new Facade();
        typeTwoSubsystem.bootstrapTypeTwo();

        // lifecycle of subsystems lives here.

        typeOneSubsystem.shutdownTypeOne();
        typeTwoSubsystem.shutdownTypeTwo();


    }
}
