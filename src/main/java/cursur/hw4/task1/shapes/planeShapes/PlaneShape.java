package cursur.hw4.task1.shapes.planeShapes;

import cursur.hw4.task1.shapeInterfaces.AreaMeasurable;
import cursur.hw4.task1.shapeInterfaces.PerimeterMeasurable;
import cursur.hw4.task1.shapes.Shape;
import cursur.hw4.task1.shapes.vertices.Vertex2D;
import lombok.Getter;

@Getter
public abstract class PlaneShape extends Shape implements PerimeterMeasurable, AreaMeasurable {

    private Vertex2D vertexA;

    public PlaneShape(Vertex2D vertexA) {
        this.vertexA = vertexA;
    }
}
