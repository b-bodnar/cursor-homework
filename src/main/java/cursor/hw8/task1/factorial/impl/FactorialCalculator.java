package cursor.hw8.task1.factorial.impl;

public class FactorialCalculator {
    public static int calculateFactorial(int element) {
        int result = 1;
        for (int i = 1; i <= element; i++) {
            result = result * i;
        }
        System.out.println("Factorial of the number " + element + " = " + result);
        return result;
    }
}
