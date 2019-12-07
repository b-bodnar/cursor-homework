package cursur.hw4.task1.shapes;

import cursur.hw4.task1.shapeInterfases.PerimeterMeasurable;
import cursur.hw4.task1.vertices.Vertex;

import java.util.List;

public abstract class PlaneShape extends Shape implements PerimeterMeasurable {

    public PlaneShape(List<Vertex> vertices) {
        super(vertices);
    }
}
