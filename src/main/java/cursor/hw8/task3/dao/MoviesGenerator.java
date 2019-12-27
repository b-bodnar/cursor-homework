package cursor.hw8.task3.dao;

import cursor.hw8.task3.model.Genre;
import cursor.hw8.task3.model.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesGenerator {

    public static List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(100, Genre.ACTION));
        movies.add(new Movie(80, Genre.ACTION));
        movies.add(new Movie(70, Genre.ACTION));
        movies.add(new Movie(60, Genre.ADVENTURE));
        movies.add(new Movie(110, Genre.ADVENTURE));
        movies.add(new Movie(120, Genre.COMEDY));
        movies.add(new Movie(130, Genre.COMEDY));
        movies.add(new Movie(140, Genre.DRAMA));
        movies.add(new Movie(100, Genre.DRAMA));
        movies.add(new Movie(100, Genre.HORROR));
        movies.add(new Movie(80, Genre.HORROR));
        movies.add(new Movie(70, Genre.HORROR));
        movies.add(new Movie(60, Genre.MUSICAL));
        movies.add(new Movie(110, Genre.MUSICAL));
        movies.add(new Movie(120, Genre.MUSICAL));
        movies.add(new Movie(130, Genre.ROMANCE));
        movies.add(new Movie(140, Genre.ROMANCE));
        movies.add(new Movie(100, Genre.ROMANCE));
        return movies;
    }
}
