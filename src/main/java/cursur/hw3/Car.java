package cursur.hw3;

public class Car {

    private Engine engine = new Engine();

    public void go(int speed) {
        engine.goWithSpeed(speed);
    }

    public void startEngine() {
        engine.turnOn();
    }

    public void stopEngine() {
        engine.turnOff();
    }


    private class Engine {

        private void turnOn() {
            System.out.println("Turn on the engine");
        }

        private void turnOff() {
            System.out.println("Turn off the engine");
        }

        private void goWithSpeed(int speed) {
            System.out.println("Go with speed: " + speed);
        }
    }
}
