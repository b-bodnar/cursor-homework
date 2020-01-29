package cursor.wh13.server;

import cursor.wh13.client.Request;

import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class WebServer {

    private static final String ADDRESS = "127.0.0.1";
    private static ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);

    public static void executeRequest(Request request) {
        if (Objects.isNull(request)) {
            System.out.println("Bad request!");
            return;
        }
        if (request.getAddress().equals(ADDRESS)) {
            executor.execute(request);
        }
    }
}
