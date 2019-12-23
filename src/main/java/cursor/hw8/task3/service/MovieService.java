package cursor.hw8.task3.service;

import cursor.hw8.task3.model.Genre;
import cursor.hw8.task3.model.Movie;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MovieService {

    public static Map<Genre, Double> calculateAverageTicketPriceByGenre(List<Movie> moviesList1, List<Movie> moviesList2) {
       return Stream.concat(
                moviesList1.stream(),
                moviesList2.stream())
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.averagingDouble(Movie::getTicketPrice)));
    }

    public static Map<Genre, Long> calculateMoviesCountByGenre(List<Movie> moviesList1, List<Movie> moviesList2) {
        return Stream.concat(
                moviesList1.stream(),
                moviesList2.stream())
                .collect(Collectors.groupingBy(
                        Movie::getGenre,
                        Collectors.counting()));
    }
}
