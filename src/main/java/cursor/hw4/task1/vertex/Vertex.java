package cursor.hw4.task1.vertex;

public abstract class Vertex {

    private int pointX;
    private int pointY;
    private int pointZ;

    public Vertex(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    public Vertex(int pointX, int pointY, int pointZ) {
        this.pointX = pointX;
        this.pointY = pointY;
        this.pointZ = pointZ;
    }

    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public int getPointZ() {
        return pointZ;
    }

    public void setPointZ(int pointZ) {
        this.pointZ = pointZ;
    }

    @Override
    public String toString() {
        return "x = " + pointX + ", y = " + pointY;
    }

}
