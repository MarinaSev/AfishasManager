package ru.netology.manager;


public class AfishaManager {

    String[] films = {
                    "Бладшот",
                    "Вперёд",
                    "Отель Белград",
                    "Джентельмены",
                    "Кошки",
                    "Кин-дза-дза",
                    "Последний самурай",
                    "Игры разума",
                    "Незнакомка",
                    "Обитель зла"
    };
    private String filmName;

    public AfishaManager() {
    }

    public AfishaManager(String filmName) {
        this.filmName = filmName;
    }

    public AfishaManager(String[] films) {
        this.films = films;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }


    public void addFilm(String filmName) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = filmName;
        films = tmp;
    }

    public String[] getLastFilms() {
        int showFilms = 10;
        int resultLength;

        if (films.length > 10) {
            resultLength = 10;
            String[] result = new String[resultLength];
            System.arraycopy(films, films.length - 10, films, 0, 10);
            for (int i = 0; i < resultLength; i++) {
                int j = resultLength - i - 1;
                result[i] = films[j];
            }
            return result;
        } else {
            resultLength = films.length;
            String[] result = new String[resultLength];
            for (int i = 0; i < resultLength; i++) {
                int j = resultLength - i - 1;
                result[i] = films[j];
            }
            return result;
        }
    }


//    public void removeFilm(String filmName) {
//        String[] tmp = new String[films.length - 1];
//        int index = 0;
//        for (int i = 0; i < films.length; i++) {
//            if (!films[i].equals(filmName)) {
//                tmp[index] = films[i];
//                index++;
//            }
//        }
//        films = tmp;
//    }

}
