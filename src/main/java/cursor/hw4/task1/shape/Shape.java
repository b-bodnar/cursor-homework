package cursor.hw4.task1.shape;

import cursor.hw4.task1.abstraction.AreaMeasurable;
import cursor.hw4.task1.vertex.Vertex;

public abstract class Shape implements AreaMeasurable {

    private Vertex vertexA;

    public Shape(Vertex vertexA) {
        this.vertexA = vertexA;
    }

    public Vertex getVertexA() {
        return vertexA;
    }

    public void setVertexA(Vertex vertexA) {
        this.vertexA = vertexA;
    }
}
