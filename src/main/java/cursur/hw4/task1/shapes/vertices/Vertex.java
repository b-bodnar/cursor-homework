package cursur.hw4.task1.shapes.vertices;

import lombok.Getter;

@Getter
public abstract class Vertex {

    private int x;
    private int y;

    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;

    }
}
