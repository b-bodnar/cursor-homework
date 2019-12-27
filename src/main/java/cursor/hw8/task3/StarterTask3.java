package cursor.hw8.task3;

import cursor.hw8.task3.dao.MoviesGenerator;
import cursor.hw8.task3.service.MovieService;

public class StarterTask3 {

    public static void startTask3() {
        print(MovieService
                .calculateAverageTicketPriceByGenre(
                        MoviesGenerator.getMovies(), MoviesGenerator.getMovies()));
        print(MovieService
                .calculateMoviesCountByGenre(
                        MoviesGenerator.getMovies(), MoviesGenerator.getMovies()));
    }

    private static void print(Object data) {
        System.out.println(data);
    }
}
