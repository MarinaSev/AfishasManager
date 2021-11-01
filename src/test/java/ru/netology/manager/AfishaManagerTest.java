package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import ru.netology.domain.FilmItem;
import ru.netology.repository.AfishaRepository;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;


public class AfishaManagerTest {
    @Mock
    private AfishaRepository repository = Mockito.mock(AfishaRepository.class);
    @InjectMocks
    private AfishaManager manager = new AfishaManager(repository);

    private FilmItem first = new FilmItem(111, 1, "Обитель зла","ужасы", 1);
    private FilmItem second = new FilmItem(222, 2, "Незнакомка","драма", 1);
    private FilmItem third = new FilmItem(333, 3, "Игры разума","драма", 1);
    private FilmItem forth = new FilmItem(444, 4, "Последний самурай","экшн", 1);
    private FilmItem fifth = new FilmItem(555, 5, "Кин-дза-дза","фэнази", 1);
    private FilmItem sixth = new FilmItem(666, 6, "Кошки","мюзикл", 1);
    private FilmItem seventh = new FilmItem(777, 7, "Джентельмены","комедия", 1);
    private FilmItem eighth = new FilmItem(888, 8, "Отель Белград","детектив", 1);
    private  FilmItem ninth = new FilmItem(999, 9, "Вперёд","триллер", 1);
    private FilmItem tenth = new FilmItem(1010, 10, "Бладшот","ужасы", 1);
    private FilmItem eleventh = new FilmItem(1111, 11, "Отчаянные","комедия", 1);

    @Test
    public void shouldGetLastFilmsFromManagerLess10() {
        FilmItem[] returned = {first, second, third};
        doReturn(returned).when(repository).findAll();

        FilmItem[] expected = {third, second, first};
        FilmItem[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetLastFilmsFromManagerMore10() {
        FilmItem[] returned = {first, second, third, forth, fifth, sixth, seventh, eighth, ninth, tenth,eleventh};
        doReturn(returned).when(repository).findAll();

        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second};
        FilmItem[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddFlm() {
        FilmItem[] returned = {forth};
        doReturn(returned).when(repository).findAll();
        manager.addFilm(forth);

        FilmItem[] expected = {forth};
        FilmItem[] actual = manager.getLastFilms();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldGetAll() {
        FilmItem[] returned = {first, second, third, forth, fifth, sixth, seventh, eighth, ninth, tenth,eleventh};
        doReturn(returned).when(repository).findAll();

        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, third, second, first};
        FilmItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldRemoveById() {
        FilmItem[] returned = {first, second, forth, fifth, sixth, seventh, eighth, ninth, tenth,eleventh};
        doReturn(returned).when(repository).findAll();

        manager.removeById(333);

        FilmItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, forth, second, first};
        FilmItem[] actual = manager.getAll();

        assertArrayEquals(expected, actual);
    }

//    @Disabled
//    @Test
//    public void shouldGetLastFilmsFrom10() {
//        AfishaManager manager = new AfishaManager();
//
//        String[] expected = {
//                "Обитель зла",
//                "Незнакомка",
//                "Игры разума",
//                "Последний самурай",
//                "Кин-дза-дза","Кошки",
//                "Джентельмены",
//                "Отель Белград",
//                "Вперёд",
//                "Бладшот"};
//        String[] actual = manager.getLastFilms();
//
//        assertArrayEquals(expected, actual);
//    }

//    @Test
//    public void shouldGetFlmList() {
//        AfishaManager manager = new AfishaManager();
//        String[] expected = {
//                "Бладшот",
//                "Вперёд",
//                "Отель Белград",
//                "Джентельмены",
//                "Кошки",
//                "Кин-дза-дза",
//                "Последний самурай",
//                "Игры разума",
//                "Незнакомка",
//                "Обитель зла"};
//        String[] actual = manager.getFilms();
//
//        assertArrayEquals(expected, actual);
//    }

//    @Test
//    public void shouldRefreshFilmList() {
//        AfishaManager manager = new AfishaManager(new String[]
//                {"Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой", "Седьмой", "Восьмой", "Девятый", "Десятый"});
//
//        String[] expected = {"Десятый", "Девятый", "Восьмой", "Седьмой", "Шестой", "Пятый", "Четвёртый", "Третий", "Второй", "Первый"};
//        String[] actual = manager.getLastFilms();
//
//        assertArrayEquals(expected, actual);
//    }

//    @Test
//    public void shouldJustRefreshFilmList() {
//        AfishaManager manager = new AfishaManager(new String[]
//                {"Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой", "Седьмой", "Восьмой", "Девятый", "Десятый"});
//
//        String[] expected = {"Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой", "Седьмой", "Восьмой", "Девятый", "Десятый"};
//        String[] actual = manager.getFilms();
//
//        assertArrayEquals(expected, actual);
//    }

//    @Test
//    public void shouldSetFilm() {
//        AfishaManager manager = new AfishaManager();
//        manager.setFilmName("Терминатор");
//
//        String expected = "Терминатор";
//        String actual = manager.getFilmName();
//
//        assertEquals(expected, actual);
//
//    }

//    @Test
//    public void shouldSetFilms() {
//        AfishaManager manager = new AfishaManager();
//        manager.setFilms(new String[] {
//                "Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой"
//        });
//
//        String[] expected = {"Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой"};
//        String[] actual = manager.getFilms();
//
//        assertArrayEquals(expected, actual);
//    }

//    @Test
//    public void shouldGetLastFilmsFromManagerMuchMore10() {
//        AfishaManager manager = new AfishaManager();
//
//        manager.setFilms(new String[] {
//                "Первый", "Второй", "Третий", "Четвёртый", "Пятый", "Шестой", "Обитель зла", "Незнакомка", "Игры разума", "Последний самурай", "Кин-дза-дза","Кошки", "Джентельмены"
//        });
//
//        String[] expected = {
//                "Джентельмены",
//                "Кошки",
//                "Кин-дза-дза",
//                "Последний самурай",
//                "Игры разума",
//                "Незнакомка",
//                "Обитель зла",
//                "Шестой",
//                "Пятый",
//                "Четвёртый"};
//        String[] actual = manager.getLastFilms();
//
//        assertArrayEquals(expected, actual);
//    }

}
