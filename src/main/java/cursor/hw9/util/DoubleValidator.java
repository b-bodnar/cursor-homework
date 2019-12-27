package cursor.hw9.util;

import static cursor.hw9.util.Printer.print;

public class DoubleValidator {

    public static double validate(double toValidate) {
        try {
            if (toValidate == 0) {
                throw new ArithmeticException("You can't divide by 0! Reenter number!");
            } else if (Double.isNaN(toValidate)) {
                throw new ArithmeticException("You enter not number! Reenter number!");
            }
        } catch (ArithmeticException e) {
            print(e.getMessage());
        }
        return toValidate;
    }
}
