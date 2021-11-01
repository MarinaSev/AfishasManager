package ru.netology.manager;

import ru.netology.domain.FilmItem;
import ru.netology.repository.AfishaRepository;


public class AfishaManager {
    private AfishaRepository repository;

    public AfishaManager(AfishaRepository repository) {
        this.repository = repository;
    }

    public void addFilm(FilmItem item) {
        repository.save(item);
    }

    public FilmItem[] getAll() {
        FilmItem[] items = repository.findAll();
        FilmItem[] result = new FilmItem[items.length];
        for(int i = 0; i < items.length; i++) {
            int j = items.length - i - 1;
            result[i] = items[j];
        }
        return result;
    }

    public FilmItem[] getLastFilms() {
        FilmItem[] items = repository.findAll();
        int showFilms = 10;
        int resultLength;

        if (items.length > showFilms) {
            resultLength = 10;
            FilmItem[] result = new FilmItem[resultLength];
            System.arraycopy(items, items.length - showFilms, items, 0, showFilms);
            for (int i = 0; i < resultLength; i++) {
                int j = resultLength - i - 1;
                result[i] = items[j];
            }
            return result;
        } else {
            resultLength = items.length;
            FilmItem[] result = new FilmItem[resultLength];
            for (int i = 0; i < resultLength; i++) {
                int j = resultLength - i - 1;
                result[i] = items[j];
            }
            return result;
        }
    }

    public void removeById(int id) {
        repository.removeById(id);
    }

}
