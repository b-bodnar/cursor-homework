package cursor.hw4.task1.shape.plane.impl;

import cursor.hw4.task1.abstraction.AreaMeasurable;
import cursor.hw4.task1.abstraction.PerimeterMeasurable;
import cursor.hw4.task1.shape.plane.PlaneShape;
import cursor.hw4.task1.vertex.Vertex2D;

public class Circle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {

    private double radius;

    public Circle(Vertex2D vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "VertexA{" + getVertexA() + '}' +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter() +
                '}';
    }
}
