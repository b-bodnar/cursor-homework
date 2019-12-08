package cursur.hw4.task1.shapes.vertices;

import lombok.Getter;

@Getter
public
class Vertex3D extends Vertex {

    private int z;

    public Vertex3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return super.toString() + ", z = " + z;

    }
}
