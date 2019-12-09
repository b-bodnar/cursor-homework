package cursor.hw4.task1.vertex;

public class Vertex3D extends Vertex {

    public Vertex3D(int x, int y, int z) {
        super(x, y, z);
    }

    @Override
    public String toString() {
        return super.toString() + ", pointZ = " + super.getPointZ();
    }
}
