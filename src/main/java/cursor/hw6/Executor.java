package cursor.hw6;

import cursor.hw6.util.ElementRemover;
import cursor.hw6.util.FruitReplacer;
import cursor.hw6.util.SimilarElementsChecker;
import java.util.ArrayList;
import java.util.List;

public class Executor {

    public static void execute() {

        ElementRemover.removeElement(fillData(10));
        print(SimilarElementsChecker
                .checkSimilarElements(fillData(30), fillData(20)));
        print(FruitReplacer
                .replaceFruit(
                        generateListOfFruits(), "Orange", "Grapefruit"));
    }

    private static List<Integer> fillData(int size) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            integerList.add((int) (Math.random() * 100));
        }
        return integerList;
    }

    private static List<String> generateListOfFruits() {

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Blackberry");
        fruits.add("Orange");
        fruits.add("Grapefruit");
        fruits.add("Blueberry");
        return fruits;
    }

    private static void print(Object o) {
        System.out.println(o.toString());
    }
}
