package cursor.hw4.task1.shape.space.impl;

import cursor.hw4.task1.abstraction.AreaMeasurable;
import cursor.hw4.task1.abstraction.VolumeMeasurable;
import cursor.hw4.task1.shape.space.SpaceShape;
import cursor.hw4.task1.vertex.Vertex3D;

public class Cuboid extends SpaceShape  implements AreaMeasurable, VolumeMeasurable {

    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex3D vertexA, double width, double height, double depth) {
        super(vertexA);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    @Override
    public double calculateVolume() {
        return width * height * depth;
    }

    @Override
    public double calculateArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "VertexA{" + getVertexA() + '}' +
                ", area = " + calculateArea() +
                ", volume = " + calculateArea() +
                '}';
    }
}
