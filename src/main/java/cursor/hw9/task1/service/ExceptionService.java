package cursor.hw9.task1.service;

import cursor.hw9.task1.model.ExceptionA;
import cursor.hw9.task1.model.ExceptionB;
import java.io.IOException;

public class ExceptionService {

    public static void throwException(int exceptionNumber) throws Exception {
        switch (exceptionNumber) {
            case 1:
                throw new ExceptionA("ExceptionA");
            case 2:
                throw new ExceptionB("ExceptionB");
            case 3:
                throw new NullPointerException("NullPointerException");
            case 4:
                throw new IOException("IOException");
            default:
                throw new Exception();
        }
    }
}
