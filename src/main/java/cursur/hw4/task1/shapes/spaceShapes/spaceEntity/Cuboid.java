package cursur.hw4.task1.shapes.spaceShapes.spaceEntity;

import cursur.hw4.task1.shapes.spaceShapes.SpaceShape;
import cursur.hw4.task1.shapes.vertices.Vertex3D;
import lombok.Getter;

@Getter
public class Cuboid extends SpaceShape {

    private double width;
    private double height;
    private double depth;

    public Cuboid(Vertex3D vertexA, double width, double height, double depth) {
        super(vertexA);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + height * depth + width * depth);
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "VertexA{" + getVertexA() + '}' +
                ", area = " + getArea() +
                ", volume = " + getVolume() +
                '}';
    }
}
