package cursor.hw7;

import cursor.hw7.library.Library;

import java.time.LocalDate;

public class Executor {

    public static void execute() {

        Library library = Library.getInstance();
        library.takeBook(LocalDate.now(), "In Search of Lost Time");
        library.takeBook(LocalDate.parse("2019-11-20"), "Ulysses");
        library.takeBook(LocalDate.parse("2019-11-19"), "Don Quixote");
        library.takeBook(LocalDate.parse("2019-11-18"), "Moby Dick");
        library.takeBook(LocalDate.parse("2019-11-17"), "War and Peace");

        System.out.println(library.showTakenBookByDate(LocalDate.now()));
        System.out.println(library.showTakenBookByRangeOfDate(LocalDate.parse("2019-11-17"), LocalDate.now()));

    }

}
