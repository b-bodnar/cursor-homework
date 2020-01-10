package cursor.hw9.execution;

import cursor.hw9.task1.model.ChildException;
import cursor.hw9.task1.service.ExceptionService;
import cursor.hw9.task2.SafeDivision;
import cursor.hw9.task3.ExceptionGenerator;

import java.util.Scanner;

public class Executor {

    public static void execute() {

        //task #1
        try {
            ExceptionService.throwException(3);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        //task #2
        Scanner sc = new Scanner(System.in);
        SafeDivision.safeDivision(sc);

        //task #3
        try {
            new ExceptionGenerator().generateChildException();
        } catch (ChildException exceptionB) {
            exceptionB.printStackTrace();
        }
    }
}
