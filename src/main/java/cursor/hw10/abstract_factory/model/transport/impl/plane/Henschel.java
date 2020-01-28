package cursor.hw10.abstract_factory.model.transport.impl.plane;

import cursor.hw10.abstract_factory.model.transport.Plane;

public class Henschel implements Plane {
    @Override
    public void fly(String destinationPlace) {
        System.out.println("Henschel flay to " + destinationPlace);
    }
}
