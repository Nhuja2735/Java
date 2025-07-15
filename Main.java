abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Main {
    public static void main(String[] args) {
        // Demonstrate polymorphism with all shapes
        Shape[] shapes = { new Circle(), new Rectangle(), new Triangle() };
        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}