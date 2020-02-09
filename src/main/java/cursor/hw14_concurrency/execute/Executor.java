package cursor.hw14_concurrency.execute;

import cursor.hw14_concurrency.service.FileReader;

import java.io.IOException;

public class Executor {

    public static void execute() {

        try {
            String path = "src/data.txt";
            print("File contains " + FileReader.countWords(path) + " words");

            FileReader.findWordsLessThenTreeLettersInLength(path);

            print("Five most repeated words:");
            FileReader.mostRepeatedWords(path, 5);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
