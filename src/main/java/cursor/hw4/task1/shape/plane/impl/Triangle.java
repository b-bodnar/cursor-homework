package cursor.hw4.task1.shape.plane.impl;

import cursor.hw4.task1.abstraction.AreaMeasurable;
import cursor.hw4.task1.abstraction.PerimeterMeasurable;
import cursor.hw4.task1.shape.plane.PlaneShape;
import cursor.hw4.task1.vertex.Vertex;
import cursor.hw4.task1.vertex.Vertex2D;

public class Triangle extends PlaneShape  implements AreaMeasurable, PerimeterMeasurable {

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

    public Vertex2D getVertexB() {
        return vertexB;
    }

    public void setVertexB(Vertex2D vertexB) {
        this.vertexB = vertexB;
    }

    public Vertex2D getVertexC() {
        return vertexC;
    }

    public void setVertexC(Vertex2D vertexC) {
        this.vertexC = vertexC;
    }

    @Override
    public double calculatePerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    @Override
    public double calculateArea() {
        double p = this.calculatePerimeter() / 2;
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
                Math.pow(vertex1.getPointX() - vertex2.getPointX(), 2)
                        + Math.pow(vertex1.getPointY() - vertex2.getPointY(), 2));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "VertexA{" + getVertexA() + '}' +
                ", VertexB{" + getVertexB() + '}' +
                ", VertexC{" + getVertexC() + '}' +
                ", area = " + calculateArea() +
                ", perimeter = " + calculatePerimeter() +
                '}';
    }
}
