package cursor.hw6.util;

import java.util.List;

public class ElementRemover {

    public static void removeElement(List<Integer> list) {
        print(list);
        list.removeIf(e -> (e % 3) == 0);
        print(list);
    }

    private static void print(List<Integer> list) {
        System.out.println(list.toString());
    }
}
