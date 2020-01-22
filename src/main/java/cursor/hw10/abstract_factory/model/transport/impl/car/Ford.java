package cursor.hw10.abstract_factory.model.transport.impl.car;

import cursor.hw10.abstract_factory.model.transport.Car;

public class Ford implements Car {
    @Override
    public void go(String destinationPlace) {
        System.out.println("Ford go to " + destinationPlace);
    }
}
