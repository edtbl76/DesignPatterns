package StructuralPatterns.GoF.Adapter.ObjectAdapter;

public class TriangleAreaAdapter {

    public double getArea(Triangle triangle) {

        /*

            The implementation details here are a matter of opinion, so I've provided two.

            The commented out version is what you'll see in most implementations, irrespective of justification.
                - this is easier to read, and easier to debug.

                SquareArea squareArea = new SquareArea();
                Square square = new Square();

                square.setLength(triangle.getBase());
                square.setWidth(0.5 * triangle.getHeight());
                return squareArea.getArea(square);

            The example below is more functional in "style". It's a bit harder to debug, and not quite as readable (
            unless you're a psycho like me who loves reactive programming (which tends to be presented more
            functionally)

        */

        return new SquareArea().getArea(new Square(triangle.getBase(), 0.5 * triangle.getHeight()));
    }
}
