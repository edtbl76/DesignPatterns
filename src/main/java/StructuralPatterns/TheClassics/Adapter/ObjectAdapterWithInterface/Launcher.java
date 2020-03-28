package StructuralPatterns.TheClassics.Adapter.ObjectAdapterWithInterface;

import java.util.*;

@SuppressWarnings("ConstantConditions")
public class Launcher {

    public static void main(String[] args) {

        /*
            Implement Square on its own
         */
        SquareImpl square = new SquareImpl(100,50);
        square.getInfo();

        System.out.println(
                String.format("Area of square with length = %s and width = %s is %s", 100, 50, square.getArea()));

        /*
            Implement Triangle on its own
         */
        TriangleImpl triangle = new TriangleImpl(20, 10);
        triangle.getInfo();
        System.out.println(
                String.format("Area of triangle with base = %s and height = %s is %s", 20, 10, triangle.getArea()));

        /*
            Triangle in terms of a square (i.e. via adapter)
         */
        SquareInterface adapter = new TriangleAdapter(triangle);
        adapter.getInfo();
        System.out.println(
                String.format("Area of triangle with base = %s and height %s (using the adapter) is %s,", 20, 10,
                        adapter.getArea()));

        /*
            This is a powerful demonstration of adapters, specifically using the interface method.
            - The interface (the adapter) doesn't know what kind of object it is getting.
         */
        List<SquareInterface> squares = new ArrayList<>();
        squares.add(square);
        try {
            squares.add((SquareInterface) triangle);
        } catch (ClassCastException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        squares.add(adapter);

        squares.forEach(squareInterface -> {
            System.out.print(squareInterface.getClass().getSimpleName() + ":");
            squareInterface.getInfo();
        });
    }
}
