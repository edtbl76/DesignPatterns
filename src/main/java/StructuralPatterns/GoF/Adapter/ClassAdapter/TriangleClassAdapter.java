package StructuralPatterns.GoF.Adapter.ClassAdapter;

import StructuralPatterns.GoF.Adapter.ObjectAdapterWithInterface.*;

public class TriangleClassAdapter extends TriangleImpl  implements SquareInterface {

    public TriangleClassAdapter(double base, double height) {
        super(base, height);
    }

    @Override
    public void getInfo() {
        super.getInfo();
    }

    @Override
    public double getArea() {
        return super.getArea();
    }
}
