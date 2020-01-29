package cursor.wh13.execute;

import cursor.wh13.client.Request;
import cursor.wh13.server.WebServer;

public class Executor {

    public static void execute() {

        for (int i = 0; i < 100; i++) {
            new Thread(() -> {
                Request request = new Request("Request "
                        + Thread.currentThread().getId(), "127.0.0.1");
                WebServer.executeRequest(request);
            }).start();
        }
    }
}
