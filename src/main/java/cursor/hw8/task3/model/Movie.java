package cursor.hw8.task3.model;

public class Movie {

    private Genre genre;
    private double ticketPrice;

    public Movie(double ticketPrice, Genre genre) {
        this.ticketPrice = ticketPrice;
        this.genre = genre;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                ", genre='" + genre + '\'' +
                ", price=" + ticketPrice +
                '}';
    }
}
