package model;

public class Movie {
    private int movieId;
    private String title;
    private String genre;
    private int duration; // in minutes
    private String language;
    private String rating;
    private String director;
    private int releaseYear;

    public Movie() {}

    public Movie(int movieId, String title, String genre, int duration,
                 String language, String rating, String director, int releaseYear) {
        this.movieId = movieId;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
        this.language = language;
        this.rating = rating;
        this.director = director;
        this.releaseYear = releaseYear;
    }

    public int getMovieId()        { return movieId; }
    public String getTitle()       { return title; }
    public String getGenre()       { return genre; }
    public int getDuration()       { return duration; }
    public String getLanguage()    { return language; }
    public String getRating()      { return rating; }
    public String getDirector()    { return director; }
    public int getReleaseYear()    { return releaseYear; }

    public void setMovieId(int movieId)        { this.movieId = movieId; }
    public void setTitle(String title)         { this.title = title; }
    public void setGenre(String genre)         { this.genre = genre; }
    public void setDuration(int duration)      { this.duration = duration; }
    public void setLanguage(String language)   { this.language = language; }
    public void setRating(String rating)       { this.rating = rating; }
    public void setDirector(String director)   { this.director = director; }
    public void setReleaseYear(int year)       { this.releaseYear = year; }

    @Override
    public String toString() { return movieId + " - " + title; }
}
