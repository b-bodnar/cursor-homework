package cursur.hw4.task1.shapes.planeShapes;

import cursur.hw4.task1.shapes.PlaneShape;
import cursur.hw4.task1.vertices.Vertex;

import java.util.List;

public class Rectangle extends PlaneShape {
    public Rectangle(List<Vertex> vertices) {
        super(vertices);
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
