package StructuralPatterns.TheClassics.Adapter.ObjectAdapterWithInterface;


public class SquareImpl implements SquareInterface {

    private double length, width;

    public SquareImpl(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public void getInfo() {
        System.out.println(String.format("Square{Length[%s], Width[%s]}", length, width));
    }

    @Override
    public double  getArea() {
        return length * width;
    }
}
