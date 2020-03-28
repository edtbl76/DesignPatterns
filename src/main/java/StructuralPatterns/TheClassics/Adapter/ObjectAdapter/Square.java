package StructuralPatterns.TheClassics.Adapter.ObjectAdapter;

public class Square {

    private double length;
    private double width;

    public Square() { }

    public Square(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Square(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
