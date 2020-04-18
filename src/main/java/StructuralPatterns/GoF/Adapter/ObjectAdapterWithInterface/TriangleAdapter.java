package StructuralPatterns.GoF.Adapter.ObjectAdapterWithInterface;

public class TriangleAdapter implements SquareInterface {

    private TriangleImpl triangle;
    public TriangleAdapter(TriangleImpl triangle) {
        this.triangle = triangle;
    }

    @Override
    public void getInfo() {
        triangle.getInfo();
    }

    @Override
    public double getArea() {
        return triangle.getArea();
    }
}
