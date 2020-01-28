package cursor.hw10.abstract_factory.model.factory;

import cursor.hw10.abstract_factory.model.transport.Car;
import cursor.hw10.abstract_factory.model.transport.Plane;

public interface TransportFactory {

    Car createCar();

    Plane createPlane();
}
