package cursur.hw4.task1.shapes.planeShapes.planeEntity;

import cursur.hw4.task1.shapes.planeShapes.PlaneShape;
import cursur.hw4.task1.shapes.vertices.Vertex2D;
import lombok.Getter;

@Getter
public class Circle extends PlaneShape {

    private double radius;

    public Circle(Vertex2D vertex, double radius) {
        super(vertex);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "VertexA{" + getVertexA() + '}' +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                '}';
    }
}
