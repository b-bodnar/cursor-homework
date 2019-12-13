package cursor.hw4.task1.shape.space;

import cursor.hw4.task1.shape.Shape;
import cursor.hw4.task1.vertex.Vertex3D;

public abstract class SpaceShape extends Shape {

    private Vertex3D vertexA;

    public SpaceShape(Vertex3D vertexA) {
        super(vertexA);
    }
}

