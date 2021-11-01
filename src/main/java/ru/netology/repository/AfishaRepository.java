package ru.netology.repository;

import ru.netology.domain.FilmItem;

public class AfishaRepository {
    private FilmItem[] items = new FilmItem[0];

    public FilmItem[] findAll() {
        return items;
    }

    public void save(FilmItem item) {
        FilmItem[] tmp = new FilmItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public FilmItem[] findById(int id) {
        FilmItem[] tmp = new FilmItem[1];
        for (FilmItem item:items) {
            if(item.getId() == id) {
                tmp[0] = item;
            }
        }
        return tmp;
    }

        public void removeById(int id) {
        FilmItem[] tmp = new FilmItem[items.length - 1];
        int index = 0;
        for (FilmItem item:items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

    public void removeAll() {
        FilmItem[] items = new FilmItem[]{};
        //как же положить пустой массив в items?
        this.items = items;
    }

}
