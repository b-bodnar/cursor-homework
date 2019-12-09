package cursor.hw1;

/**
 * H/W Intro
 *
 * @author Bohdan Bodnar
 */

public class HW1 {
    public static void main(String[] args) {

        byte b = 8;
        short sh = 16;
        int i = 32;
        long l = 64L;
        float f = 32f;
        double d = 64;
        char ch = 16;

        print(b + sh);
        print(i - l);
        print(f / d);
        print(ch + i);
    }

    /**
     * The method takes any parameter and prints it
     */
    private static void print(Object o) {
        System.out.println(o);
    }

}
