package StructuralPatterns.GoF.Adapter.ObjectAdapter;

public class Launcher {
    public static void main(String[] args) {

        TriangleAreaAdapter adapter = new TriangleAreaAdapter();
        Triangle triangle = new Triangle(10, 5);
        System.out.println(String.format(
                "The area of a triangle with base = %s and height = %s is %s", 10, 5, adapter.getArea(triangle)));
    }
}
