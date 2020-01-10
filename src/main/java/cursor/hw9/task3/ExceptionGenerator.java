package cursor.hw9.task3;

import cursor.hw9.task1.model.ParentException;
import cursor.hw9.task1.model.ChildException;

public class ExceptionGenerator {

    private static void generateParentException() throws ParentException {
        throw new ParentException("ParentException throw from method generateParentException()");
    }

    public void generateChildException() throws ChildException {
        try {
            generateParentException();
        } catch (ParentException parentException) {
            ChildException childException = new ChildException("Throw ChildException from method generateChildException()");
            childException.addSuppressed(parentException);
            throw childException;
        }
    }
}
