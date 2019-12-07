package cursur.hw4.task1;

import java.util.ArrayList;
import java.util.List;

public class Shape {

    private List<Vertices> vertices;

    public Shape() {
        this.vertices = new ArrayList<>();
    }

    public void addVertices(Vertices vertices) {
        this.vertices.add(vertices);
    }
}
