package cursor.hw10.abstract_factory.model.factory.impl;

import cursor.hw10.abstract_factory.model.factory.TransportFactory;
import cursor.hw10.abstract_factory.model.transport.Car;
import cursor.hw10.abstract_factory.model.transport.Plane;
import cursor.hw10.abstract_factory.model.transport.impl.car.Audi;
import cursor.hw10.abstract_factory.model.transport.impl.plane.Henschel;

public class GermanFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }

    @Override
    public Plane createPlane() {
        return new Henschel();
    }
}
