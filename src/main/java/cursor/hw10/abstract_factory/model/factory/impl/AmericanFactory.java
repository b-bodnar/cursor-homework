package cursor.hw10.abstract_factory.model.factory.impl;

import cursor.hw10.abstract_factory.model.factory.TransportFactory;
import cursor.hw10.abstract_factory.model.transport.Car;
import cursor.hw10.abstract_factory.model.transport.Plane;
import cursor.hw10.abstract_factory.model.transport.impl.car.Ford;
import cursor.hw10.abstract_factory.model.transport.impl.plane.Boeing;

public class AmericanFactory implements TransportFactory {
    @Override
    public Car createCar() {
        return new Ford();
    }

    @Override
    public Plane createPlane() {
        return new Boeing();
    }
}
