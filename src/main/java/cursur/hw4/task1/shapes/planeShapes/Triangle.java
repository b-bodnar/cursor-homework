package cursur.hw4.task1.shapes.planeShapes;

import cursur.hw4.task1.shapes.PlaneShape;
import cursur.hw4.task1.vertices.Vertex;
import lombok.Getter;

import java.util.List;

@Getter
public class Triangle extends PlaneShape {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(List<Vertex> vertices) {
        super(vertices);
        initializeSideOfTriangle();
    }

    @Override
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double getArea() {
        double halfThePer = this.getPerimeter() / 2;
        return Math.sqrt(
                halfThePer * (halfThePer - this.sideA)
                        * (halfThePer - this.sideB)
                        * (halfThePer - this.sideC));
    }

    private void initializeSideOfTriangle() {
        List<Vertex> vert = this.getVertices();

        this.sideA = getDistanceBetweenVertices(vert.get(0), vert.get(1));
        this.sideB = getDistanceBetweenVertices(vert.get(1), vert.get(2));
        this.sideC = getDistanceBetweenVertices(vert.get(2), vert.get(0));
    }

    private static double getDistanceBetweenVertices(Vertex vertices1, Vertex vertices2) {
        return Math.sqrt(
                Math.pow(vertices1.getX() - vertices2.getX(), 2)
                        + Math.pow(vertices1.getY() - vertices2.getY(), 2));
    }
}
