package cursur.hw4.task1.shapes.planeShapes;

import cursur.hw4.task1.shapes.PlaneShape;
import cursur.hw4.task1.vertices.Vertex;
import lombok.Getter;

import java.util.List;

@Getter
public class Circle extends PlaneShape {

    private double radius;

    public Circle(List<Vertex> vertices, double radius) {
        super(vertices);
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
}
