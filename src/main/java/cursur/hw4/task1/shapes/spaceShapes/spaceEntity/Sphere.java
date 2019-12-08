package cursur.hw4.task1.shapes.spaceShapes.spaceEntity;

import cursur.hw4.task1.shapes.spaceShapes.SpaceShape;
import cursur.hw4.task1.shapes.vertices.Vertex3D;
import lombok.Getter;

@Getter
public class Sphere extends SpaceShape {

    private double radius;

    public Sphere(Vertex3D vertexA, double radius) {
        super(vertexA);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "VertexA{" + getVertexA() + '}' +
                ", area = " + getArea() +
                ", volume = " + getVolume() +
                '}';
    }
}
