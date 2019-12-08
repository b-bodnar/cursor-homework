package cursur.hw4.task1;

import cursur.hw4.task1.shapes.Shape;
import cursur.hw4.task1.shapes.planeShapes.planeEntity.Circle;
import cursur.hw4.task1.shapes.planeShapes.planeEntity.Rectangle;
import cursur.hw4.task1.shapes.planeShapes.planeEntity.Triangle;
import cursur.hw4.task1.shapes.spaceShapes.spaceEntity.Cuboid;
import cursur.hw4.task1.shapes.spaceShapes.spaceEntity.Sphere;
import cursur.hw4.task1.shapes.spaceShapes.spaceEntity.SquarePyramid;
import cursur.hw4.task1.shapes.vertices.Vertex2D;
import cursur.hw4.task1.shapes.vertices.Vertex3D;

public class HW4 {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(new Vertex2D(120, 200), 36),
                new Triangle(new Vertex2D(10, 20), new Vertex2D(40, 50), new Vertex2D(10, 80)),
                new Rectangle(new Vertex2D(300, 400), 50, 100),
                new Cuboid(new Vertex3D(40, 60, 55), 30, 30, 70),
                new Sphere(new Vertex3D(10, 10, 10), 20),
                new SquarePyramid(new Vertex3D(20,20,20),30,30)

        };

        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
