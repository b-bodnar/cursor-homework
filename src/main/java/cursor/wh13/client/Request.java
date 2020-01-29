package cursor.wh13.client;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Request implements Runnable {

    private String request;
    private String address;

    @Override
    public void run() {
        System.out.println(request);
    }
}
