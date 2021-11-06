package ru.netology.manager;


public class AfishaManager {

    String[] films = {};
    int filmsLimit = 10;

    public AfishaManager() {
    }

    public AfishaManager(int filmsLimit) {
        this.filmsLimit = filmsLimit;
    }

    public String[] getFilms() {
        return films;
    }

    public void setFilms(String[] films) {
        this.films = films;
    }

    public int getFilmsLimit() {
        return filmsLimit;
    }

    public void setFilmsLimit(int filmsLimit) {
        this.filmsLimit = filmsLimit;
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
        int resultLength;

        if (films.length > filmsLimit) {
            resultLength = filmsLimit;
            String[] result = new String[resultLength];
            System.arraycopy(films, films.length - filmsLimit, films, 0, filmsLimit);
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
