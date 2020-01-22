package cursor.hw10.abstract_factory.model.transport.impl.car;

import cursor.hw10.abstract_factory.model.transport.Car;

public class Audi implements Car {
    @Override
    public void go(String destinationPlace) {
        System.out.println("Audi go to " + destinationPlace);
    }
}
