package StructuralPatterns.TheClassics.Adapter.ObjectAdapterWithInterface;


public class TriangleImpl implements TriangleInterface {

    private double base, height;

    public TriangleImpl(double base , double height) {
        this.base = base;
        this.height = height;
    }


    @Override
    public void getInfo() {
        System.out.println(String.format("Triangle{Base[%s], Height[%s]}", base, height));
    }

    @Override
    public double  getArea() {
        return 0.5 * base * height;
    }
}
