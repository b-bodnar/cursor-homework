package cursur.hw4.task1.shapes.spaceShapes.spaceEntity;

import cursur.hw4.task1.shapes.spaceShapes.SpaceShape;
import cursur.hw4.task1.shapes.vertices.Vertex3D;
import lombok.Getter;

@Getter
public class SquarePyramid extends SpaceShape {

    private double width;
    private double height;

    public SquarePyramid(Vertex3D vertex3D, double width, double height) {
        super(vertex3D);
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 2 * width * (
                width / (2 + Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2))));
    }

    @Override
    public double getVolume() {
        return (Math.pow(width, 2) * height) / 3;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "VertexA{" + getVertexA() + '}' +
                ", area = " + getArea() +
                ", volume = " + getVolume() +
                '}';
    }
}
