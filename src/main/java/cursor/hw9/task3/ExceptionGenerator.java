package cursor.hw9.task3;

import cursor.hw9.task1.model.ExceptionA;
import cursor.hw9.task1.model.ExceptionB;

public class ExceptionGenerator {

    private static void generateExceptionA() throws ExceptionA {
        throw new ExceptionA("ExceptionA throw from method generateExceptionA()");
    }

    public void throwExceptionB() throws ExceptionB {
        try {
            generateExceptionA();
        } catch (ExceptionA exceptionA) {
            ExceptionB exceptionB = new ExceptionB("Throw ExceptionB from method throwExceptionB()");
            exceptionB.addSuppressed(exceptionA);
            throw exceptionB;
        }
    }
}
