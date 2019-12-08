package cursur.hw4.task1.shapes.planeShapes.planeEntity;

import cursur.hw4.task1.shapes.planeShapes.PlaneShape;
import cursur.hw4.task1.shapes.vertices.Vertex;
import cursur.hw4.task1.shapes.vertices.Vertex2D;
import lombok.Getter;

@Getter
public class Triangle extends PlaneShape {

    private Vertex2D vertexB;
    private Vertex2D vertexC;

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Vertex2D vertexA, Vertex2D vertexB, Vertex2D vertexC) {
        super(vertexA);
        this.vertexB = vertexB;
        this.vertexC = vertexC;
        findSideOfTriangle();
    }

    @Override
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.sideA)
                * (p - this.sideB)
                * (p - this.sideC)
        );
    }

    private void findSideOfTriangle() {

        this.sideA = findDistanceBetweenVertices(this.getVertexA(), this.vertexB);
        this.sideB = findDistanceBetweenVertices(this.vertexB, this.vertexC);
        this.sideC = findDistanceBetweenVertices(this.vertexC, this.getVertexA());
    }

    private double findDistanceBetweenVertices(Vertex vertex1, Vertex vertex2) {
        return Math.sqrt(
                Math.pow(vertex1.getX() - vertex2.getX(), 2)
                        + Math.pow(vertex1.getY() - vertex2.getY(), 2));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "VertexA{" + getVertexA() + '}' +
                ", VertexB{" + getVertexB() + '}' +
                ", VertexC{" + getVertexC() + '}' +
                ", area = " + getArea() +
                ", perimeter = " + getPerimeter() +
                '}';
    }
}
