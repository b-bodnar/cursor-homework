package cursor.hw12.dao;

import cursor.hw12.model.Node;

import java.util.LinkedHashMap;
import java.util.Map;

public class AverageSalaryDao {

    private static Map<String, Node> cache = new LinkedHashMap<>(10, 1, false);

    public static Map<String, Node> getCache() {
        return fillData();
    }

    private static Map<String, Node> fillData() {
        cache.put("Luxembourg", new Node(3009));
        cache.put("Ireland", new Node(2464));
        cache.put("Sweden", new Node(2465));
        cache.put("Germany", new Node(2270));
        cache.put("Netherlands", new Node(2263));
        cache.put("France", new Node(2157));
        cache.put("United Kingdom", new Node(2102));
        cache.put("Austria", new Node(2009));
        cache.put("Spain", new Node(1718));
        cache.put("Italy", new Node(1762));
        return cache;
    }
}
