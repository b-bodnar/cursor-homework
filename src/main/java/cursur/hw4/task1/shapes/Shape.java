package cursur.hw4.task1.shapes;

import cursur.hw4.task1.shapeInterfases.AreaMeasurable;
import cursur.hw4.task1.vertices.Vertex;
import lombok.Getter;

import java.util.List;

@Getter
public abstract class Shape implements AreaMeasurable {

    private List<Vertex> vertices;

    public Shape(List<Vertex> vertices) {
        this.vertices = vertices;
    }

}
