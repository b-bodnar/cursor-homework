package cursor.hw10.abstract_factory.model.transport.impl.car;

import cursor.hw10.abstract_factory.model.transport.Car;

public class Audi implements Car {
    @Override
    public void go(String to) {
        System.out.println("Audi go to " + to);
    }
}
