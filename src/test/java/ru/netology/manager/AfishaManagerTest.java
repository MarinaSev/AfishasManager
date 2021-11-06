package ru.netology.manager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AfishaManagerTest {

    private String film1 = "Бладшот";
    private String film2 = "Вперёд";
    private String film3 = "Отель Белград";
    private String film4 = "Джентельмены";
    private String film5 = "Кошки";
    private String film6 = "Кин-дза-дза";
    private String film7 = "Последний самурай";
    private String film8 = "Игры разума";
    private String film9 = "Незнакомка";
    private String film10 = "Обитель зла";
    private String film11 = "Отчаянные";
    private String film12 = "Мужчина и женщина";

    @Test
    public void shouldGetLastFilmsLessLimitList() {
        AfishaManager manager = new AfishaManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);

        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastFilmsAboveLimitList() {
        AfishaManager manager = new AfishaManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = {
                "Мужчина и женщина",
                "Отчаянные",
                "Обитель зла",
                "Незнакомка",
                "Игры разума",
                "Последний самурай",
                "Кин-дза-дза",
                "Кошки",
                "Джентельмены",
                "Отель Белград"};;
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastFilmsSameLimitList() {
        AfishaManager manager = new AfishaManager();

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);

        String[] expected = {
                "Обитель зла",
                "Незнакомка",
                "Игры разума",
                "Последний самурай",
                "Кин-дза-дза",
                "Кошки",
                "Джентельмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот"};;
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastFilmsLessManagerLimitList() {
        AfishaManager manager = new AfishaManager(12);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);

        String[] expected = {"Кин-дза-дза","Кошки", "Джентельмены", "Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastFilmsAboveManagerLimitList() {
        AfishaManager manager = new AfishaManager(8);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);
        manager.addFilm(film9);
        manager.addFilm(film10);
        manager.addFilm(film11);
        manager.addFilm(film12);

        String[] expected = {
                "Мужчина и женщина",
                "Отчаянные",
                "Обитель зла",
                "Незнакомка",
                "Игры разума",
                "Последний самурай",
                "Кин-дза-дза",
                "Кошки"};;
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastFilmsManagerLimitList() {
        AfishaManager manager = new AfishaManager(8);

        manager.addFilm(film1);
        manager.addFilm(film2);
        manager.addFilm(film3);
        manager.addFilm(film4);
        manager.addFilm(film5);
        manager.addFilm(film6);
        manager.addFilm(film7);
        manager.addFilm(film8);

        String[] expected = {
                "Игры разума",
                "Последний самурай",
                "Кин-дза-дза",
                "Кошки",
                "Джентельмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот"};;
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

}
