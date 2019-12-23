package cursor.hw7.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {

    private static Map<LocalDate, String> dateToBookMap = new HashMap<>();
    private static List<String> books = fillBooks();
    private static Library library;

    private Library() {
    }

    public static Library getInstance() {
        if (library == null) {
            library = new Library();
        }
        return library;
    }

    public String showTakenBookByDate(LocalDate date) {
        return dateToBookMap.getOrDefault(date, "There are no books for this date");
    }

    public List<String> showTakenBookByRangeOfDate(LocalDate from, LocalDate to) {
        return dateToBookMap.entrySet().stream()
                .filter(entry ->
                        entry.getKey().isAfter(from.minusDays(1))
                                && entry.getKey().isBefore(to.plusDays(1)))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public boolean takeBook(LocalDate date, String bookName) {
        if (books.remove(bookName)) {
            dateToBookMap.put(date, bookName);
            return true;
        }
        return false;
    }

    private static List<String> fillBooks() {
        List<String> books = new ArrayList<>();
        books.add("In Search of Lost Time");
        books.add("Ulysses");
        books.add("Don Quixote");
        books.add("Moby Dick");
        books.add("The Great Gatsby");
        books.add("War and Peace");
        books.add("The Adventures of Huckleberry Finn");
        books.add("Alice's Adventures in Wonderland");
        books.add("Anna Karenina");
        books.add("To Kill a Mockingbird");
        return books;
    }

}
