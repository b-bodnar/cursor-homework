package cursor.hw4.task1.shape.plane;

import cursor.hw4.task1.abstraction.PerimeterMeasurable;
import cursor.hw4.task1.shape.Shape;
import cursor.hw4.task1.vertex.Vertex2D;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable {

    public PlaneShape(Vertex2D vertexA) {
        super(vertexA);
    }
}
