package cursor.hw6;

import java.util.*;

public class Homework6 {

    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>(Arrays.asList(3, 9, 11, 18, 20, 22));
        List<Integer> integerList2 = new ArrayList<>(Arrays.asList(1, 3, 9, 21, 22));

        List<Integer> integerList3 = new ArrayList<>(Arrays.asList(1, 3, 9, 21, 22, 30, 44, 58));

        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Blackberry");
        fruits.add("Orange");
        fruits.add("Grapefruit");
        fruits.add("Blueberry");

        System.out.println(replaceFruit(fruits));

        System.out.println(checkSimilarElements(integerList1, integerList2));

        removeElement(integerList3);
        integerList3.forEach(System.out::println);
    }

    public static String replaceFruit(List<String> fruits) {
        return Collections
                .replaceAll(fruits, "Orange", "Grapefruit")
                ? "Value is replaced"
                : "Value is not present!";
    }

    public static void removeElement(List<Integer> list) {
        list.removeIf(e -> (e % 3) == 0);
    }

    public static boolean checkSimilarElements(Collection<Integer> src1, Collection<Integer> src2) {
        return src1.retainAll(src2);
    }
}
