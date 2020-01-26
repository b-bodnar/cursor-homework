package cursor.hw12.execute;

import cursor.hw12.service.LFUCacheService;

public class Executor {
    public static void execute() {

        LFUCacheService lfuCacheService = LFUCacheService.getInstance();

        System.out.println("Cache before use");
        lfuCacheService.printCache();

        lfuCacheService.getNode("Ireland");
        lfuCacheService.getNode("Sweden");
        lfuCacheService.getNode("Luxembourg");
        lfuCacheService.getNode("Netherlands");
        lfuCacheService.getNode("France");
        lfuCacheService.getNode("United Kingdom");
        lfuCacheService.getNode("Austria");
        lfuCacheService.getNode("Spain");
        lfuCacheService.getNode("Italy");

        lfuCacheService.addNode("Finland", 2509);

        System.out.println("Cache after use");
        lfuCacheService.printCache();
    }
}
