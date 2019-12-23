package cursor.hw8.starter;

import cursor.hw8.task1.factorial.Factorial;
import cursor.hw8.task1.factorial.impl.FactorialCalculator;
import cursor.hw8.task2.service.UserService;
import cursor.hw8.task3.dao.MoviesGenerator;
import cursor.hw8.task3.service.MovieService;

public class Executor {

    public static void execute() {

        //task #1
        Factorial factorial = FactorialCalculator::calculateFactorial;
        factorial.calculateFactorial(5);

        //task #2
        UserService.getUsersLoggedWeekAgo()
                .entrySet()
                .forEach(System.out::println);

        //task #3
        print(MovieService.calculateAverageTicketPriceByGenre(
                MoviesGenerator.getMovies(), MoviesGenerator.getMovies()));
        print(MovieService.calculateMoviesCountByGenre(
                MoviesGenerator.getMovies(), MoviesGenerator.getMovies()));
    }

    private static void print(Object o) {
        System.out.println(o);
    }
}
