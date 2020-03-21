package TheClassics.Prototype.Copyable2;

public class CopyPrototype {

    /*
        Technically this is a ReadOnly object because my fields are private and I've only
        provided getters.
        - This is incidental, because I didn't feel like writing a test to test the mutators.
     */
    private int serialNumber;
    private String model;

    public CopyPrototype(int serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    /*
        This is an overloaded constructor that takes another CopyPrototype as an argument and initializes its fields
        from the fields of the argument.

        This is effectively a copy() constructor.
     */
    public CopyPrototype(CopyPrototype prototype) {
        this.serialNumber = prototype.getSerialNumber();
        this.model = prototype.getModel();
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void print() {
        System.out.println("Model: " + model + " S/N: " + serialNumber);
    }
}
