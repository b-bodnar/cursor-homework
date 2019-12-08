package cursur.hw4.task1.shapes.spaceShapes;


import cursur.hw4.task1.shapeInterfaces.AreaMeasurable;
import cursur.hw4.task1.shapeInterfaces.VolumeMeasurable;
import cursur.hw4.task1.shapes.Shape;
import cursur.hw4.task1.shapes.vertices.Vertex3D;
import lombok.Getter;

@Getter
public abstract class SpaceShape extends Shape implements VolumeMeasurable, AreaMeasurable {

    private Vertex3D vertexA;

    public SpaceShape(Vertex3D vertex3D) {
        this.vertexA = vertex3D;
    }
}

