package TheClassics.Prototype.Copyable2;

public class Launcher {

    public static void main(String[] args) {

        /*
            instantiate a prototype using S/N and Model arguments
         */
        CopyPrototype cp1 = new CopyPrototype(1, "Doomaflatchey");
        System.out.print("First Model: ");
        cp1.print();

        /*
            Do it again, but pass the first prototype as an argument
         */
        CopyPrototype cp2 = new CopyPrototype(cp1);
        System.out.print("Copied: ");
        cp2.print();
    }
}
