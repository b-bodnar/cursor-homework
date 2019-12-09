package cursor.hw4.task1.shape.space.impl;

import cursor.hw4.task1.shape.space.SpaceShape;
import cursor.hw4.task1.vertex.Vertex3D;

public class Sphere extends SpaceShape {

    private double radius;

    public Sphere(Vertex3D vertexA, double radius) {
        super(vertexA);
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
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double calculateVolume() {
        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "VertexA{" + getVertexA() + '}' +
                ", area = " + calculateArea() +
                ", volume = " + calculateVolume() +
                '}';
    }
}
