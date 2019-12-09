package cursor.hw4.task1.shape.space.impl;

import cursor.hw4.task1.shape.space.SpaceShape;
import cursor.hw4.task1.vertex.Vertex3D;

public class SquarePyramid extends SpaceShape {

    private double width;
    private double height;

    public SquarePyramid(Vertex3D vertex3D, double width, double height) {
        super(vertex3D);
        this.width = width;
        this.height = height;
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

    @Override
    public double calculateArea() {
        return 2 * width * (
                width / (2 + Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2))));
    }

    @Override
    public double calculateVolume() {
        return (Math.pow(width, 2) * height) / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "VertexA{" + getVertexA() + '}' +
                ", area = " + calculateArea() +
                ", volume = " + calculateArea() +
                '}';
    }
}
