package ru.netology.filmmanager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmsManagerTest {
    FilmsManager manager = new FilmsManager();

    @Test
    public void addNewMovies() {
        manager.addNewFilm("Один дома");
        manager.addNewFilm("Пираты карибского моря");
        manager.addNewFilm("Убить Билла");
        manager.addNewFilm("Смешарики в кино");
        manager.addNewFilm("Черепашки-ниндзя");
        manager.addNewFilm("Судья Дредд");
    }

    @Test
    public void shouldFindAll() {
        String film1 = "Один дома";
        String film2 = "Пираты карибского моря";
        String film3 = "Убить Билла";
        String film4 = "Смешарики в кино";
        String film5 = "Черепашки-ниндзя";
        String film6 = "Судья Дредд";

        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);

        String[] expected = {film1, film2, film3, film4, film5, film6};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFive() {
        FilmsManager manager = new FilmsManager(5);

        String film1 = "Один дома";
        String film2 = "Пираты карибского моря";
        String film3 = "Убить Билла";
        String film4 = "Смешарики в кино";
        String film5 = "Черепашки-ниндзя";
        String film6 = "Судья Дредд";

        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);
        manager.addNewFilm(film4);
        manager.addNewFilm(film5);
        manager.addNewFilm(film6);

        String[] expected = {film6, film5, film4, film3, film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindMin() {
        FilmsManager manager = new FilmsManager(5);

        String film1 = "Один дома";
        String film2 = "Пираты карибского моря";
        String film3 = "Убить Билла";


        manager.addNewFilm(film1);
        manager.addNewFilm(film2);
        manager.addNewFilm(film3);

        String[] expected = {film3, film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}