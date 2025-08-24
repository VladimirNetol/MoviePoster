package ru.netology.filmmanager;

public class FilmsManager {
    private String[] Movies = new String[0];
    private int movieThreshold;

    public FilmsManager() {
        this.movieThreshold = 5;
    }

    public FilmsManager(int movieThreshold) {
        this.movieThreshold = movieThreshold;
    }

    public void addNewFilm(String NewFilm) {
        String[] tmp = new String[Movies.length + 1];
        for (int i = 0; i < Movies.length; i++) {
            tmp[i] = Movies[i];
        }
        tmp[tmp.length - 1] = NewFilm;
        Movies = tmp;
    }

    public String[] findAll() {
        return Movies;
    }

    public String[] findLast() {
        int resultLeight;
        if (Movies.length < movieThreshold) {
            resultLeight = Movies.length;
        } else {
            resultLeight = movieThreshold;
        }
        String[] result = new String[resultLeight];
        for (int i = 0; i < resultLeight; i++) {
            result[i] = Movies[Movies.length - 1 - i];
        }
        return result;
    }
}
