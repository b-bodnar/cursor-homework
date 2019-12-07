package cursur.hw4.task1.shapes;


import cursur.hw4.task1.shapeInterfases.VolumeMeasurable;
import cursur.hw4.task1.vertices.Vertex;

import java.util.List;

public abstract class SpaceShape extends Shape implements VolumeMeasurable {

    public SpaceShape(List<Vertex> vertices) {
        super(vertices);
    }
}

