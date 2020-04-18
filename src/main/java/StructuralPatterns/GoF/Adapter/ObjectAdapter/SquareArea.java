package StructuralPatterns.GoF.Adapter.ObjectAdapter;

public class SquareArea {

    public double getArea(Square square) {
        return square.getLength() * square.getWidth();
    }
}
