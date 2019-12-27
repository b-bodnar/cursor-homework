package cursor.hw5.task2;

import java.util.ArrayList;
import java.util.List;

public class MyList<T extends Comparable<T>> {

    private List<T> list = new ArrayList<>();

    public void add(T element) {
        list.add(element);
    }

    public List<T> getList() {
        return list;
    }
}
