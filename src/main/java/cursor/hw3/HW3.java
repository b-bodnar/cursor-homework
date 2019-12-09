package cursor.hw3;

public class HW3 {

    public static void main(String[] args) {

        Car mercedes = new Car();

        mercedes.startEngine();
        mercedes.go(60);
        mercedes.stopEngine();

        Circle circle = new Circle(20);
        System.out.println("Square of circle: "
                + circle.squareOfCircle());

        CounterClass counter1 = new CounterClass();
        CounterClass counter2 = new CounterClass();
        CounterClass counter3 = new CounterClass();

        System.out.println(CounterClass.getInstanceCounter());
    }
}
