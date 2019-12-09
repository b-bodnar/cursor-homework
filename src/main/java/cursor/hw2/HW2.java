package cursor.hw2;

import java.util.*;

public class HW2 {

    public static void main(String[] args) {

        Integer[] array = {2, 3, 1, 7, 11, 2, 3, 7, 1};

        Integer[] arrayContainsNegativeValue = {2, -3, 1, -7, 11, -2, 3, -7, 1};

        sortDes(array);

        print(sumPositiveValue(arrayContainsNegativeValue));

        print(findAverage(array));

        replaceDuplicates(array);
    }

    public static void sortDes(Integer[] array) {

        Arrays.sort(array, Collections.reverseOrder());
        print(Arrays.toString(array));
    }

    public static int sumPositiveValue(Integer[] array) {

        return Arrays
                .stream(array)
                .filter(n -> n >= 0)
                .reduce(0, Integer::sum);
    }

    public static double findAverage(Integer[] array) {

        OptionalDouble average = Arrays.stream(array)
                .mapToDouble(n -> n)
                .average();

        return average.isPresent()
                ? average.getAsDouble()
                : 0;
    }

    public static void replaceDuplicates(Integer[] array) {

        Set<Integer> duplicates = new HashSet<>();
        for (int i = 0; i < array.length; i++) {
            if (!duplicates.add(array[i])) {
                array[i] = 0;
            }
        }
        print(Arrays.toString(array));
    }

    private static void print(Object o) {

        System.out.println(o);
    }
}

