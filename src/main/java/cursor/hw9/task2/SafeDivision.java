package cursor.hw9.task2;

import java.util.Scanner;
import static cursor.hw9.util.DoubleValidator.validate;
import static cursor.hw9.util.Printer.print;

public class SafeDivision {

    public static void safeDivision(Scanner scanner) {

        print("Enter divided");
        double divided = scanner.nextDouble();
        double divider = 0;
        boolean validDivider = false;
        while (!validDivider) {
            print("Enter divider");
            divider = validate(scanner.nextDouble());
            validDivider = true;
        }
        print(divided / divider);
    }
}
