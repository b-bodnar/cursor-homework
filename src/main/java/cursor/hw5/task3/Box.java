package cursor.hw5.task3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class Box<T extends Comparable<T>> {

    private T[] box;

    public Box(T[] box) {
        this.box = box;
    }

    public T[] getBox() {
        return box;
    }

    public void setBox(T[] box) {
        this.box = box;
    }

    public Optional<T> getLargestElement() {
        return Arrays.stream(box)
                .max(Comparator.naturalOrder());
    }

    public Optional<T> getSmallestElement() {
        return Arrays.stream(box)
                .min(Comparator.naturalOrder());
    }
}
