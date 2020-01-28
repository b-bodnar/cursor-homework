package cursor.hw10.abstract_factory.execute;

import cursor.hw10.abstract_factory.model.factory.TransportFactory;
import cursor.hw10.abstract_factory.model.factory.impl.AmericanFactory;
import cursor.hw10.abstract_factory.model.factory.impl.GermanFactory;
import cursor.hw10.abstract_factory.model.transport.Car;
import cursor.hw10.abstract_factory.model.transport.Plane;

public class Executor {
    private static TransportFactory factory;
    private static final int AMERICAN_FACTORY = 1;
    private static final int GERMAN_FACTORY = 2;

    public static void execute() {

        chooseFactory(AMERICAN_FACTORY);

        Car car = factory.createCar();
        car.go("New York");

        Plane plane = factory.createPlane();
        plane.fly("Perice");
    }

    private static void chooseFactory(int factoryToCreate) {
        switch (factoryToCreate) {
            case AMERICAN_FACTORY:
                factory = new GermanFactory();
                break;
            case GERMAN_FACTORY:
                factory = new AmericanFactory();
                break;
            default:
                System.out.println("Factory undefine!");
        }
    }
}
