package cursur.hw4.task1.shapes.planeShapes.planeEntity;

import cursur.hw4.task1.shapes.planeShapes.PlaneShape;
import cursur.hw4.task1.shapes.vertices.Vertex2D;
import lombok.Getter;

@Getter
public class Rectangle extends PlaneShape {

    private double width;
    private double high;

    public Rectangle(Vertex2D vertexA, double width, double high) {
        super(vertexA);
        this.width = width;
        this.high = high;
    }

    @Override
    public double getArea() {
        return this.width * this.high;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.high) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "VertexA{" + getVertexA() + "} " +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                '}';
    }
}
