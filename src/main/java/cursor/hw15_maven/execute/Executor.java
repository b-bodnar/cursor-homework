package cursor.hw15_maven.execute;

import cursor.hw15_maven.service.FileReader;

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
