package cursor.hw10.abstract_factory.execute;

import cursor.hw10.abstract_factory.model.factory.TransportFactory;
import cursor.hw10.abstract_factory.model.factory.impl.AmericanFactory;
import cursor.hw10.abstract_factory.model.factory.impl.GermanFactory;
import cursor.hw10.abstract_factory.model.transport.Car;
import cursor.hw10.abstract_factory.model.transport.Plane;


public class Executor {
    private static TransportFactory factory;

    public static void execute() {

        int factoryID = 2;
        chooseFactory(factoryID);

        Car car = factory.createCar();
        car.go("New York");

        Plane plane = factory.createPlane();
        plane.fly("Perice");
    }

    private static void chooseFactory(int factoryID) {
        switch (factoryID) {
            case 1:
                factory = new GermanFactory();
                break;
            case 2:
                factory = new AmericanFactory();
                break;
            default:
                System.out.println("Factory undefine!");
        }
    }
}
