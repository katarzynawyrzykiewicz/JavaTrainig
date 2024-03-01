        package org.example;
public class Movie

{
    private String title;
    private int year;
    private int movieRating;
    public Movie(String title, int year, int movieRating)

    {
        this.title = title;
        this.year = year;
        this.movieRating = movieRating;

    }
    public Movie()

    {

    }
    public String getTitle() {
        return title;

    }
    public void setTitle(String title) {
        this.title = title;

    }
    public int getYear() {
        return year;

    }
    public void setYear(int year) {
        this.year = year;

    }
    public int getRating() {
        return movieRating;

    }
    public void setRating(int rating) {
        this.movieRating = rating;

    }
    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rating=" + movieRating +
                '}';

    }

}
