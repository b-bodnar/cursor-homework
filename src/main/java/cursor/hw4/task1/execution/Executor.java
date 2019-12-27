package cursor.hw4.task1.execution;

import cursor.hw4.task1.shape.Shape;
import cursor.hw4.task1.shape.plane.impl.Circle;
import cursor.hw4.task1.shape.plane.impl.Rectangle;
import cursor.hw4.task1.shape.plane.impl.Triangle;
import cursor.hw4.task1.shape.space.impl.Cuboid;
import cursor.hw4.task1.shape.space.impl.Sphere;
import cursor.hw4.task1.shape.space.impl.SquarePyramid;
import cursor.hw4.task1.vertex.Vertex2D;
import cursor.hw4.task1.vertex.Vertex3D;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    public void start() {
        print(generateData());
    }

    private void print(List<Shape> shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    private List<Shape> generateData() {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(new Vertex2D(120, 200), 36));
        shapes.add(new Triangle(new Vertex2D(10, 20), new Vertex2D(40, 50), new Vertex2D(10, 80)));
        shapes.add(new Rectangle(new Vertex2D(300, 400), 50, 100));
        shapes.add(new Cuboid(new Vertex3D(40, 60, 55), 30, 30, 70));
        shapes.add(new Sphere(new Vertex3D(10, 10, 10), 20));
        shapes.add(new SquarePyramid(new Vertex3D(20, 20, 20), 30, 30));
        return shapes;
    }
}
