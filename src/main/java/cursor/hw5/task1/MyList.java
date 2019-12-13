package cursor.hw5.task1;

import java.util.*;

public class MyList<T extends Number> {

    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public List<T> getList() {
        return list;
    }

    public OptionalDouble getMax() {
        return list.stream()
                .mapToDouble(Number::doubleValue)
                .max();
    }

    public OptionalDouble getMin() {
        return list.stream()
                .mapToDouble(Number::doubleValue)
                .min();
    }
}
