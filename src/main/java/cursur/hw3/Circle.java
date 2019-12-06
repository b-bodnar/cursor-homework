package cursur.hw3;

import lombok.Getter;

@Getter
public class Circle {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double squareOfCircle() {
        return Math.PI * Math.pow(this.getRadius(), 2);
    }

}
