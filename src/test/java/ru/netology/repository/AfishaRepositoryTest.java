package ru.netology.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;

import static org.junit.jupiter.api.Assertions.*;

class AfishaRepositoryTest {

    @Test
    public void shouldFindAll() {
        AfishaRepository repository = new AfishaRepository();
        FilmItem first = new FilmItem(111, 1, "Обитель зла","ужасы", 1);
        FilmItem second = new FilmItem(222, 2, "Незнакомка","драма", 1);
        FilmItem third = new FilmItem(333, 3, "Игры разума","драма", 1);
        FilmItem forth = new FilmItem(444, 4, "Последний самурай","экшн", 1);
        FilmItem fifth = new FilmItem(555, 5, "Кин-дза-дза","фэнази", 1);
        FilmItem sixth = new FilmItem(666, 6, "Кошки","мюзикл", 1);
        FilmItem seventh = new FilmItem(777, 7, "Джентельмены","комедия", 1);
        FilmItem eighth = new FilmItem(888, 8, "Отель Белград","детектив", 1);
        FilmItem ninth = new FilmItem(999, 9, "Вперёд","триллер", 1);
        FilmItem tenth = new FilmItem(1010, 10, "Бладшот","ужасы", 1);

        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(forth);
        repository.save(fifth);
        repository.save(sixth);
        repository.save(seventh);
        repository.save(eighth);
        repository.save(ninth);
        repository.save(tenth);

        FilmItem[] expected = new FilmItem[]{first, second, third, forth, fifth, sixth, seventh, eighth, ninth, tenth};
        FilmItem[] actual = repository.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSave() {
        AfishaRepository repository = new AfishaRepository();
        FilmItem eleventh = new FilmItem(1111, 11, "Отчаянные","комедия", 1);

        repository.save(eleventh);

        FilmItem[] expected = new FilmItem[]{eleventh};
        FilmItem[] actual = repository.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindById() {
        AfishaRepository repository = new AfishaRepository();
        int id = 333;

        FilmItem first = new FilmItem(111, 1, "Обитель зла","ужасы", 1);
        FilmItem second = new FilmItem(222, 2, "Незнакомка","драма", 1);
        FilmItem third = new FilmItem(333, 3, "Игры разума","драма", 1);
        FilmItem forth = new FilmItem(444, 4, "Последний самурай","экшн", 1);
        FilmItem fifth = new FilmItem(555, 5, "Кин-дза-дза","фэнази", 1);
        FilmItem sixth = new FilmItem(666, 6, "Кошки","мюзикл", 1);

        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(forth);
        repository.save(fifth);
        repository.save(sixth);

        FilmItem[] expected = new FilmItem[]{third};
        FilmItem[] actual = repository.findById(id);;

        assertArrayEquals(expected, actual);
    }

    @Disabled
    @Test
    void shouldRemoveById() {
        AfishaRepository repository = new AfishaRepository();
        int id = 333;

        FilmItem first = new FilmItem(111, 1, "Обитель зла","ужасы", 1);
        FilmItem second = new FilmItem(222, 2, "Незнакомка","драма", 1);
        FilmItem third = new FilmItem(333, 3, "Игры разума","драма", 1);
        FilmItem forth = new FilmItem(444, 4, "Последний самурай","экшн", 1);
        FilmItem fifth = new FilmItem(555, 5, "Кин-дза-дза","фэнази", 1);
        FilmItem sixth = new FilmItem(666, 6, "Кошки","мюзикл", 1);

        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(forth);
        repository.save(fifth);
        repository.save(sixth);

        repository.removeById(id);

        FilmItem[] expected = new FilmItem[]{first, second, forth, fifth, sixth};
        FilmItem[] actual = repository.findAll();

        assertArrayEquals(expected, actual);
    }
}