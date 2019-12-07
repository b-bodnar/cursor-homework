package cursur.hw4.task1.vertices;

import lombok.Getter;

@Getter
class Vertex3D extends Vertex {

    private int z;

    public Vertex3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}
