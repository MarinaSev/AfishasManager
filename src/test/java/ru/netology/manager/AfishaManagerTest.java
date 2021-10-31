package ru.netology.manager;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class AfishaManagerTest {

    @Test
    public void shouldGetLastFilmsFromManagerLess10() {
        AfishaManager manager = new AfishaManager(new String[]{"Бладшот", "Вперёд", "Отель Белград"});

        String[] expected = {"Отель Белград", "Вперёд", "Бладшот"};
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastFilmsFromManagerMore10() {
                AfishaManager manager = new AfishaManager("Отчаянные");

                manager.addFilm(manager.getFilmName());

        String[] expected = {
                "Отчаянные",
                "Обитель зла",
                "Незнакомка",
                "Игры разума",
                "Последний самурай",
                "Кин-дза-дза",
                "Кошки",
                "Джентельмены",
                "Отель Белград",
                "Вперёд"};
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastFilmsFrom10() {
        AfishaManager manager = new AfishaManager();

        String[] expected = {
                "Обитель зла",
                "Незнакомка",
                "Игры разума",
                "Последний самурай",
                "Кин-дза-дза","Кошки",
                "Джентельмены",
                "Отель Белград",
                "Вперёд",
                "Бладшот"};
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFlm() {
        AfishaManager manager = new AfishaManager("Отчаянные");

        manager.addFilm(manager.getFilmName());

        String[] expected = {
                "Бладшот",
                "Вперёд",
                "Отель Белград",
                "Джентельмены",
                "Кошки",
                "Кин-дза-дза",
                "Последний самурай",
                "Игры разума",
                "Незнакомка",
                "Обитель зла",
                "Отчаянные"
        };
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetFlmList() {
        AfishaManager manager = new AfishaManager();
        String[] expected = {
                "Бладшот",
                "Вперёд",
                "Отель Белград",
                "Джентельмены",
                "Кошки",
                "Кин-дза-дза",
                "Последний самурай",
                "Игры разума",
                "Незнакомка",
                "Обитель зла"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRefreshFilmList() {
        AfishaManager manager = new AfishaManager(new String[]
                {"Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой", "Седьмой", "Восьмой", "Девятый", "Десятый"});

        String[] expected = {"Десятый", "Девятый", "Восьмой", "Седьмой", "Шестой", "Пятый", "Четвёртый", "Третий", "Второй", "Первый"};
        String[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldJustRefreshFilmList() {
        AfishaManager manager = new AfishaManager(new String[]
                {"Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой", "Седьмой", "Восьмой", "Девятый", "Десятый"});

        String[] expected = {"Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой", "Седьмой", "Восьмой", "Девятый", "Десятый"};
        String[] actual = manager.getFilms();

        assertArrayEquals(expected, actual);
    }

}
