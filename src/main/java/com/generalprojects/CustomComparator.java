package com.generalprojects;
// Java program to demonstrate Comparator interface
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movie2 {
    private String n; // Movie name
    private double r; // Movie rating
    private int y;    // Movie year

    // Constructor to initialize movie details
    public Movie2(String n, double r, int y) {
        this.n = n;
        this.r = r;
        this.y = y;
    }

    // Getter methods
    public String getN() {
        return n;
    }
    public double getR() {
        return r;
    }
    public int getY() {
        return y;
    }
}

// Comparator to sort movies by rating
class Rating implements Comparator<Movie2> {
    public int compare(Movie2 m1, Movie2 m2) {

        // Sort by rating in descending order
        return Double.compare(m2.getR(), m1.getR());
    }
}

// Comparator to sort movies by name
class NameCompare implements Comparator<Movie2> {
    public int compare(Movie2 m1, Movie2 m2) {

        // Sort by name in alphabetical order
        return m1.getN().compareTo(m2.getN());
    }
}

// Main class
public class CustomComparator {
    public static void main(String[] args) {

        // Create a list of movies
        ArrayList<Movie2> m = new ArrayList<>();
        m.add(new Movie2("Lu Shu Force Awakens", 8.3, 2015));
        m.add(new Movie2("Random Star Wars", 8.7, 1977));
        m.add(new Movie2("Fake Empire Strikes Back", 8.8, 1980));

        // Sort movies by rating and display all
        Collections.sort(m, new Rating());
        System.out.println("Movies sorted by rating:");
        for (Movie2 m1 : m) {
            System.out.println(m1.getR() + " " + m1.getN() + " " + m1.getY());
        }

        // Sort movies by name and display all
        Collections.sort(m, new NameCompare());
        System.out.println("\nMovies sorted by name:");
        for (Movie2 m1 : m) {
            System.out.println(m1.getN() + " " + m1.getR() + " " + m1.getY());
        }
    }
}