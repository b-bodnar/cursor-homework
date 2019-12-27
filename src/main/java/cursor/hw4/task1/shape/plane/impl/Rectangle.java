package cursor.hw4.task1.shape.plane.impl;

import cursor.hw4.task1.abstraction.AreaMeasurable;
import cursor.hw4.task1.abstraction.PerimeterMeasurable;
import cursor.hw4.task1.shape.plane.PlaneShape;
import cursor.hw4.task1.vertex.Vertex2D;

public class Rectangle extends PlaneShape implements AreaMeasurable, PerimeterMeasurable {

    private double width;
    private double high;

    public Rectangle(Vertex2D vertexA, double width, double high) {
        super(vertexA);
        this.width = width;
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    @Override
    public double calculateArea() {
        return this.width * this.high;
    }

    @Override
    public double calculatePerimeter() {
        return (this.width + this.high) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "VertexA{" + getVertexA() + "} " +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter() +
                '}';
    }
}
