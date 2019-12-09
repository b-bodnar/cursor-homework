package cursor.hw4.task1.shape.space;

import cursor.hw4.task1.abstraction.VolumeMeasurable;
import cursor.hw4.task1.shape.Shape;
import cursor.hw4.task1.vertex.Vertex3D;

public abstract class SpaceShape extends Shape implements VolumeMeasurable {

    private Vertex3D vertexA;

    public SpaceShape(Vertex3D vertexA) {
        super(vertexA);
    }
}

