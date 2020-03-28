package StructuralPatterns.TheClassics.Adapter.ObjectAdapter;

public class Triangle {

    private double base;
    private double height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
