package cursur.hw4.task1.vertices;

import lombok.Getter;

@Getter
public abstract class Vertex {

    private int x;
    private int y;

    public Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
