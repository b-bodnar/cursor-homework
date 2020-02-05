package cursor.hw12.service;

import cursor.hw12.dao.AverageSalaryDao;
import cursor.hw12.model.Node;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;

public class LFUCacheService {
    private static final int CAPACITY = 10;
    private static Map<String, Node> cache;
    public static LFUCacheService lfuCacheService;

    private LFUCacheService() {
        cache = AverageSalaryDao.getCache();
    }

    public static LFUCacheService getInstance() {
        return Objects.nonNull(lfuCacheService)
                ? lfuCacheService
                : new LFUCacheService();
    }

    public void addNode(String country, int averageSalary) {
        if (isFull()) {
            cache.remove(getLFUKey());
        }
        cache.put(country, new Node(averageSalary));
    }

    private String getLFUKey() {
        String key = null;
        var minFrequency = Integer.MAX_VALUE;

        for (Map.Entry<String, Node> entry : cache.entrySet()) {
            if (minFrequency > entry.getValue().getFrequency()) {
                key = (entry.getKey());
                minFrequency = entry.getValue().getFrequency();
            }
        }
        return key;
    }

    public Optional<Node> getNode(String key) {
        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.setFrequency(node.getFrequency() + 1);
            cache.put(key, node);
            return Optional.of(node);
        }
        return Optional.empty();
    }

    private boolean isFull() {
        return cache.size() == CAPACITY;
    }

    public void printCache() {
        cache.forEach((k, v) -> System.out.print(
                k + ": " + v.getAverageSalary() + "| "));
        System.out.println("");
    }
}
