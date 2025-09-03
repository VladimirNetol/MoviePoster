package ru.netology.filmmanager;

public class FilmsManager {
    private String[] movies = new String[0];
    private int movieThreshold;

    public FilmsManager() {
        this.movieThreshold = 5;
    }

    public FilmsManager(int movieThreshold) {
        this.movieThreshold = movieThreshold;
    }

    public void addNewFilm(String NewFilm) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = NewFilm;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLeight;
        if (movies.length < movieThreshold) {
            resultLeight = movies.length;
        } else {
            resultLeight = movieThreshold;
        }
        String[] result = new String[resultLeight];
        for (int i = 0; i < resultLeight; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}
