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
        String Film1 = "Один дома";
        String Film2 = "Пираты карибского моря";
        String Film3 = "Убить Билла";
        String Film4 = "Смешарики в кино";
        String Film5 = "Черепашки-ниндзя";
        String Film6 = "Судья Дредд";

        manager.addNewFilm(Film1);
        manager.addNewFilm(Film2);
        manager.addNewFilm(Film3);
        manager.addNewFilm(Film4);
        manager.addNewFilm(Film5);
        manager.addNewFilm(Film6);

        String[] expected = {Film1, Film2, Film3, Film4, Film5, Film6};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastFive() {
        FilmsManager manager = new FilmsManager(5);

        String Film1 = "Один дома";
        String Film2 = "Пираты карибского моря";
        String Film3 = "Убить Билла";
        String Film4 = "Смешарики в кино";
        String Film5 = "Черепашки-ниндзя";
        String Film6 = "Судья Дредд";

        manager.addNewFilm(Film1);
        manager.addNewFilm(Film2);
        manager.addNewFilm(Film3);
        manager.addNewFilm(Film4);
        manager.addNewFilm(Film5);
        manager.addNewFilm(Film6);

        String[] expected = {Film6, Film5, Film4, Film3, Film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void shouldFindMin() {
        FilmsManager manager = new FilmsManager(5);

        String Film1 = "Один дома";
        String Film2 = "Пираты карибского моря";
        String Film3 = "Убить Билла";


        manager.addNewFilm(Film1);
        manager.addNewFilm(Film2);
        manager.addNewFilm(Film3);

        String[] expected = {Film3, Film2, Film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}