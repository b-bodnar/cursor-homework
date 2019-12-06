package cursur.hw3;

public class CounterClass {

    private static int instanceCounter = 0;

    public CounterClass() {
        instanceCounter++;
    }

    public static int getInstanceCounter() {
        return instanceCounter;
    }
}
