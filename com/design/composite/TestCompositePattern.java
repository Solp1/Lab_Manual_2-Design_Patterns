package com.design.composite;

public class TestCompositePattern {

    public static void main(String[] args) {
        Shape triangle = new Triangle();
        Shape circle = new Circle();
        Shape square = new Square();

        Drawing drawing = new Drawing();
        drawing.add(triangle);
        drawing.add(circle);
        drawing.add(square);

        System.out.println("Drawing filled with YELLOW color:");
        drawing.draw("Yellow");

        drawing.clear();

        drawing.add(triangle);
        drawing.add(square);

        System.out.println("Drawing filled with BLUE color:");
        drawing.draw("Blue");
    }
}
