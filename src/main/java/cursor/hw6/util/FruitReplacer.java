package cursor.hw6.util;

import java.util.Collections;
import java.util.List;

public class FruitReplacer {

    public static String replaceFruit(List<String> fruits, String oldFruit, String newFruit) {
        return Collections
                .replaceAll(fruits, oldFruit, newFruit)
                ? "Value is replaced"
                : "Value is not present!";
    }
}
