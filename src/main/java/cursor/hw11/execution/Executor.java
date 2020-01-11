package cursor.hw11.execution;

import java.util.ArrayList;
import java.util.List;

public class Executor {

    public static void execute() {

        List<Integer[]> holders = new ArrayList<>();
        for (int i = 1; true; i++) {
            holders.add(new Integer[10000000]);
        }
    }
}
