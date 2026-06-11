package model;

import java.sql.Timestamp;

public class Screening {
    private int screeningId;
    private int movieId;
    private int hallId;
    private Timestamp screeningTime;
    private double price;
    private int availableSeats;

    public Screening() {}

    public Screening(int screeningId, int movieId, int hallId,
                     Timestamp screeningTime, double price, int availableSeats) {
        this.screeningId = screeningId;
        this.movieId = movieId;
        this.hallId = hallId;
        this.screeningTime = screeningTime;
        this.price = price;
        this.availableSeats = availableSeats;
    }

    public int getScreeningId()          { return screeningId; }
    public int getMovieId()              { return movieId; }
    public int getHallId()               { return hallId; }
    public Timestamp getScreeningTime()  { return screeningTime; }
    public double getPrice()             { return price; }
    public int getAvailableSeats()       { return availableSeats; }

    public void setScreeningId(int id)               { this.screeningId = id; }
    public void setMovieId(int movieId)              { this.movieId = movieId; }
    public void setHallId(int hallId)                { this.hallId = hallId; }
    public void setScreeningTime(Timestamp t)        { this.screeningTime = t; }
    public void setPrice(double price)               { this.price = price; }
    public void setAvailableSeats(int seats)         { this.availableSeats = seats; }

    @Override
    public String toString() { return screeningId + " - " + screeningTime; }
}
