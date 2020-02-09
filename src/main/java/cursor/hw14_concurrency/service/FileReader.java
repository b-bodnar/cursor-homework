package cursor.hw14_concurrency.service;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;

public class FileReader {

    private static String[] extraSymbols = {".", ",", "!", "(", ")"};

    public static int countWords(String file) throws NoSuchElementException, IOException {

        return (int) Files.lines(Path.of(file))
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> !word.isBlank() && !word.isEmpty())
                .count();
    }

    public static void findWordsLessThenTreeLettersInLength(String file) throws IOException {

        List<String> shortWords = Files.lines(Path.of(file))
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .map(String::trim)
                .map(String::toLowerCase)
                .filter(word -> !word.isBlank() && word.length() < 3)
                .collect(Collectors.toList());

        System.out.println("Found "
                + shortWords.size()
                + " words less than 3 letters long");

        shortWords.stream()
                .distinct()
                .forEach(System.out::println);
    }

    public static void mostRepeatedWords(String file, int mostRepeated) throws IOException {

        Map<String, Integer> words = new HashMap<>();

        Files.lines(Path.of(file))
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .filter(word -> !word.isBlank())
                .map(String::trim)
                .map(String::toLowerCase)
                .map(FileReader::removeExtraSymbols)
                .forEach(word -> putWordWithIndexOfRepeated(words, word));

        sortByMostRepeated(words).entrySet().stream()
                .limit(mostRepeated)
                .forEach(e -> System.out.println(e.getKey() + ": " + e.getValue()));
    }

    private static Map<String, Integer> sortByMostRepeated(Map<String, Integer> words) {

        return words.entrySet()
                .stream()
                .sorted((Map.Entry.<String, Integer>comparingByValue()
                        .reversed()))
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
    }

    private static void putWordWithIndexOfRepeated(Map<String, Integer> words, String word) {

        if (words.containsKey(word)) {
            words.put(word, words.get(word) + 1);
        } else {
            words.put(word, 1);
        }
    }

    private static String removeExtraSymbols(String word) {

        if (word.contains("'")) {
            word = word.substring(0, word.indexOf("'"));
        }
        for (String symbol : extraSymbols) {
            if (word.contains(symbol)) {
                word = word.replace(symbol, "");
            }
        }
        return word;
    }
}
